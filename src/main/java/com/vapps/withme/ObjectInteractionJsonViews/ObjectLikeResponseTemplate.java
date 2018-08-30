package com.vapps.withme.ObjectInteractionJsonViews;

public class ObjectLikeResponseTemplate {

    private long likeCount;
    private long dislikeCount;

    public ObjectLikeResponseTemplate(long likeCount, long dislikeCount) {
        this.likeCount = likeCount;
        this.dislikeCount = dislikeCount;
    }

    public long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(long likeCount) {
        this.likeCount = likeCount;
    }

    public long getDislikeCount() {
        return dislikeCount;
    }

    public void setDislikeCount(long dislikeCount) {
        this.dislikeCount = dislikeCount;
    }
}
