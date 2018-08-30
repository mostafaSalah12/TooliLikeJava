package com.vapps.withme.ObjectInteractionJsonViews;

/**
 * Created by kmagdy on 8/13/2017.
 */
public class ObjectRatingResponseTemplate {

    private  long totalNumberOfRating;
    private  double averageRating;

    public ObjectRatingResponseTemplate() {
    }

    public ObjectRatingResponseTemplate(long totalNumberOfRating, double averageRating) {
        this.totalNumberOfRating = totalNumberOfRating;
        this.averageRating = averageRating;
    }

    public long getTotalNumberOfRating() {
        return totalNumberOfRating;
    }

    public void setTotalNumberOfRating(long totalNumberOfRating) {
        this.totalNumberOfRating = totalNumberOfRating;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }
}
