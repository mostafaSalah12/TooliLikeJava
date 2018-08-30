package com.algorithmz.tooli.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algorithmz.tooli.model.ObjectReviewReportings;
import com.algorithmz.tooli.model.ObjectReviews;
import com.algorithmz.tooli.repository.ObjectReviewReportRepository;
import com.algorithmz.tooli.repository.ObjectReviewsRepository;

/**
 * Created by Mostafa Salah.
 */
@Service
public class ObjectReviewReportService {

    @Autowired
    private ObjectReviewReportRepository objectReviewReportRepository;

    @Autowired
    private ObjectReviewsRepository objectReviewsRepository;

    public ObjectReviews reportReviewOrReply(String reviewId, String userId) {
        ObjectReviewReportings objectReviewReportings = objectReviewReportRepository.findByReviewIdAndUserId(reviewId, userId);
        ObjectReviews review = objectReviewsRepository.findById(reviewId).get();

        if (objectReviewReportings == null) {
            objectReviewReportings = new ObjectReviewReportings(reviewId, userId, new Date());
            ObjectReviewReportings savedObjectReviewReportings = objectReviewReportRepository.save(objectReviewReportings);
            review.setNoOfReportings((short) objectReviewReportRepository.countByReviewId(reviewId));
            objectReviewsRepository.save(review);
        }
        return review;
    }

}
