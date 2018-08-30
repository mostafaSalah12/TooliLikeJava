package com.algorithmz.tooli.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algorithmz.tooli.model.ObjectLikes;
import com.algorithmz.tooli.model.Users;
import com.algorithmz.tooli.repository.LikeStatusRepository;
import com.algorithmz.tooli.repository.ObjectLikeRepository;
import com.algorithmz.tooli.repository.ObjectTypeRepository;
import com.algorithmz.tooli.repository.UserRepository;

/**
 * Created by Mostafa Salah 
 */
@Service
public class ObjectLikeService {

    public static byte LIKE = 1;
    public static byte DISLIKE = 2;

    @Autowired
    private ObjectLikeRepository objectLikeRepository;
    @Autowired
    private LikeStatusRepository likeStatusRepository;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ObjectTypeRepository objectTypeRepository;

    public ObjectLikes likeObject(String objectId, String objectType, String userId, String likeStatus) {
        ObjectLikes objectLike = objectLikeRepository.findByObjectIdAndUserId_UserId(objectId, userId);
        if (objectLike != null) {
            if (likeStatus == "1" || likeStatus == "2") {
                objectLike.setLikeStatusId(likeStatusRepository.findById(likeStatus).get());
                objectLikeRepository.save(objectLike);
            } else {
                objectLikeRepository.delete(objectLike);
            }
        } else {
            Optional<Users> user = userRepository.findById(userId);
            objectLike = new ObjectLikes(objectId, objectTypeRepository.findById(objectType).get(), user.get(), likeStatusRepository.findById(likeStatus).get());
            objectLikeRepository.save(objectLike);
        }
        return objectLike;
    }

    public long calculateCountByLikeStatus(String objectId, short objectType, short likeStatus) {
        return objectLikeRepository.countByObjectIdAndObjectTypeId_ObjectTypeIdAndLikeStatusId_LikeStatusId(objectId, objectType, likeStatus);
    }
}






