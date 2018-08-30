package com.vapps.withme.ObjectInteractionJsonViews;

/**
 * Created by kmagdy on 8/13/2017.
 */
public class ObjectViewingResponseTemplate {

    private long totalViewCounting;

    public ObjectViewingResponseTemplate() {
    }

    public ObjectViewingResponseTemplate(long totalViewCounting) {
        this.totalViewCounting = totalViewCounting;
    }

    public long getTotalViewCounting() {
        return totalViewCounting;
    }

    public void setTotalViewCounting(long totalViewCounting) {
        this.totalViewCounting = totalViewCounting;
    }
}
