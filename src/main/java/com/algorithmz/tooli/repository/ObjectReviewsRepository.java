package com.algorithmz.tooli.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.algorithmz.tooli.model.ObjectReviews;

/**
 * Created by Mostafa Salah.
 */
@Repository
public interface ObjectReviewsRepository extends MongoRepository<ObjectReviews, String> {

    public List<ObjectReviews> findByObjectIdAndObjectTypeId_ObjectTypeIdAndParentReviewId_ReviewId(String objectId, Short objectType, Pageable pageable, Long parentReviewId);

    public Long countByObjectIdAndObjectTypeId_ObjectTypeIdAndParentReviewId_ReviewId(String objectId, Short objectType, Long parentReviewId);

}
