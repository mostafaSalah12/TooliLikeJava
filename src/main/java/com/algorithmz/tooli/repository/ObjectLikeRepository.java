package com.algorithmz.tooli.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.algorithmz.tooli.model.ObjectLikes;

/**
 * Created by Mostafa Salah
 */
@Repository
public interface ObjectLikeRepository extends MongoRepository<ObjectLikes, String> {

    public ObjectLikes findByObjectIdAndUserId_UserId(String objectId, String userId);

    public Long countByObjectIdAndObjectTypeId_ObjectTypeIdAndLikeStatusId_LikeStatusId(String objectId, Short orderType, Short likeStatusId);
}
