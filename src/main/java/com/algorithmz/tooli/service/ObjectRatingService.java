package com.algorithmz.tooli.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algorithmz.tooli.model.ObjectRatings;
import com.algorithmz.tooli.model.Orders;
import com.algorithmz.tooli.repository.ObjectRatingRepository;

/**
 * Created by kmagdy on 8/13/2017.
 */
@Service
public class ObjectRatingService {

    @Autowired
    private ObjectRatingRepository objectRatingRepository;
    @Autowired
    private com.algorithmz.tooli.repository.OrderRepository orderRepository;
    @Autowired
    private com.algorithmz.tooli.repository.ObjectTypeRepository objectTypeRepository;
    @Autowired
    private com.algorithmz.tooli.repository.UserRepository userRepository;
//    @Autowired
//    private OAuth2RestTemplate oAuth2RestTemplate;
//    @Value("${acquirePromotedActionPointsUrl}")
//    private String acquirePromotedActionPointsUrl;

    public ObjectRatings rateObject(String objectId, String objectType, String userId, byte ratingValue, String orderId) {
        ObjectRatings objectRatingByUserId = objectRatingRepository.findByObjectIdAndObjectTypeId_ObjectTypeIdAndUserId_UserId(objectId, objectType, userId);

        if (orderId != null) {
            Orders orderDB = orderRepository.findById(orderId).get();
            
            if (orderDB.getUserId() != userId) //this user doesn't have this order to rate on it return error
            {
                return null;
            }
        }
        if (objectRatingByUserId == null) {
//        AcquirePointsRequest acquirePointsRequest = new AcquirePointsRequest((short) 68);
//        ResponseEntity<Void> response = oAuth2RestTemplate.postForEntity(acquirePromotedActionPointsUrl, acquirePointsRequest, Void.class);

            ObjectRatings objectRatings = new ObjectRatings(objectId, ratingValue, orderId, objectTypeRepository.findById(objectType).get(), userRepository.findById(userId).get());
            return objectRatingRepository.save(objectRatings);
        } else {
            objectRatingByUserId.setRating(ratingValue);
            return objectRatingRepository.save(objectRatingByUserId);
        }
    }

    public long getTotalRating(String objectId, short objectType) {
        return objectRatingRepository.countByObjectIdAndObjectTypeId_ObjectTypeId(objectId, objectType);
    }

    public Double getAverageRating(String objectId, short objectType) {
        return objectRatingRepository.getAverageRatingByObjectId(objectId, objectType);
    }

}
