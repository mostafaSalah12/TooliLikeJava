/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package com.algorithmz.tooli.service;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vapps.withme.nosql.model.NDealDetails;
import com.vapps.withme.nosql.repository.NDealDetailsRepository;

*//**
 *
 * @author Mostafa Salah
 *//*
@Service
public class IndexingValueService {

    @Autowired
    private NDealDetailsRepository dealDetailsRepository;
    @Autowired
    private ObjectLikeService objectLikeService;
    @Autowired
    private ObjectViewService objectViewService;
    @Autowired
    private ObjectRatingService objectRatingService;

    public void updateIndexValueCalculation(String objectId) {
        NDealDetails dealDB = dealDetailsRepository.findOne(objectId);
        double finalValue = calculateLikesWeight(objectId, dealDB)
                + calculateViewingsWeight(objectId, dealDB)
                + calculateAverageRatingWeight(objectId)
                + calculateDeliveredOrderWeight(dealDB);

        dealDB.setIndexingValue(Math.round(finalValue * 100.0) / 100.0);
        dealDetailsRepository.delete(dealDB);
        dealDetailsRepository.save(dealDB);
    }

    private double calculateLikesWeight(String objectId, NDealDetails dealDB) {
        long noOfLikes = objectLikeService.calculateCountByLikeStatus(objectId, (short) 2, (short) 1);
        long noOfDisLikes = objectLikeService.calculateCountByLikeStatus(objectId, (short) 2, (short) 2);
        long differ = System.currentTimeMillis() - dealDB.getCreationDateTime().getTime();
        long noOfDays = TimeUnit.DAYS.convert(differ, TimeUnit.MILLISECONDS);
        return ((noOfLikes - noOfDisLikes) / (double) (noOfDays + 1));
    }

    private double calculateViewingsWeight(String objectId, NDealDetails dealDB) {
        long totalNumberOfViewing = objectViewService.getTotalNumberOfViewing(objectId, (short) 2);
        long differ = System.currentTimeMillis() - dealDB.getCreationDateTime().getTime();
        long noOfDays = TimeUnit.DAYS.convert(differ, TimeUnit.MILLISECONDS);
        return (totalNumberOfViewing / (double) (noOfDays + 1)) * 5;
    }

    private double calculateAverageRatingWeight(String objectId) {
        Double averageRating = objectRatingService.getAverageRating(objectId, (short) 2);
        return (averageRating == null ? 0.0 : averageRating * 10);
    }

    private double calculateDeliveredOrderWeight(NDealDetails dealDB) {
        long differ = System.currentTimeMillis() - dealDB.getCreationDateTime().getTime();
        long noOfDays = TimeUnit.DAYS.convert(differ, TimeUnit.MILLISECONDS);
        return (dealDB.getDeliveredOrders() / (double) (noOfDays + 1)) * 15;
    }

}
*/