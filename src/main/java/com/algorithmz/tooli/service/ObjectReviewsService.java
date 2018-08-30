/*
package com.algorithmz.tooli.service;


import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Service;

import com.algorithmz.tooli.model.ObjectReviews;
import com.algorithmz.tooli.model.Users;
import com.algorithmz.tooli.repository.ObjectReviewsRepository;
import com.algorithmz.tooli.repository.ObjectTypeRepository;

/**
 * Created by kmagdy on 8/13/2017.
 */
/*/
@Service
public class ObjectReviewsService {

    @Autowired
    ObjectReviewsRepository objectReviewsRepository;

    @Autowired
    ObjectTypeRepository objectTypeRepository;

    @Autowired
    OAuth2RestTemplate oAuth2RestTemplate;
    @Value("${acquirePromotedActionPointsUrl}")
    private String acquirePromotedActionPointsUrl;

    public ObjectReviews submitReviewOrReply(String objectId, short objectTypeId, String reviewText, Long parentReviewId, boolean discloseReview, Long dealId, Users user) {
        ObjectReviews parentReview = null;
        if (parentReviewId != null) {
            parentReview = objectReviewsRepository.findOne(parentReviewId);
        }
        ObjectReviews objectReviews = new ObjectReviews(objectId, reviewText, discloseReview, new Date(), dealId, objectTypeRepository.findOne(objectTypeId), parentReview, user.getUserId());
//        AcquirePointsRequest acquirePointsRequest = new AcquirePointsRequest((short) 69);
//        ResponseEntity<Void> response = oAuth2RestTemplate.postForEntity(acquirePromotedActionPointsUrl, acquirePointsRequest, Void.class);
        return objectReviewsRepository.save(objectReviews);
    }

    public Map<String, Object> getAllReviews(String objectId, Short objectTypeId, int page, Integer size) {
        Map<String, Object> response = new HashMap<>();
        Boolean isNext = false;
        size = size == null ? 10 : size;
        Long numberOfobjectReviews = objectReviewsRepository.countByObjectIdAndObjectTypeId_ObjectTypeIdAndParentReviewId_ReviewId(objectId, objectTypeId, null);
        long numberOfPages = numberOfobjectReviews / size;
        isNext = page >= numberOfPages ? false : true;
        response.put("objectReviews", objectReviewsRepository.findByObjectIdAndObjectTypeId_ObjectTypeIdAndParentReviewId_ReviewId(objectId, objectTypeId, new PageRequest(page, size, Sort.Direction.DESC, "creationDateTime"), null));
        response.put("isNext", isNext);
        return response;
    }

    public ObjectReviews editReview(long reviewId, String reviewText) {

        ObjectReviews objectReview = objectReviewsRepository.findOne(reviewId);
        objectReview.setReviewText(reviewText);
        objectReview.setEditingDateTime(new Timestamp(new Date().getTime()));
        return objectReviewsRepository.save(objectReview);
    }

    public void deleteReview(long reviewId) {

        ObjectReviews objectReview = objectReviewsRepository.findOne(reviewId);
        objectReviewsRepository.delete(objectReview);
    }

}
*/