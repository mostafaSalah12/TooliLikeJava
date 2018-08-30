package com.algorithmz.tooli.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.algorithmz.tooli.model.ObjectReviewReportings;

/**
 * Created by Mostafa Salah.
 */
@Repository
public interface ObjectReviewReportRepository extends MongoRepository<ObjectReviewReportings, String> {

    public long countByReviewId(String reviewId);

    public ObjectReviewReportings findByReviewIdAndUserId(String reviewId, String userId);
}
