package com.vapps.withme.ObjectInteractionJsonViews;

/**
 * Created by kmagdy on 8/12/2017.
 */
public class ObjectLikeRequestTemplate extends ObjectInteractionCommonRequest {

    private byte likeStatus;

    public ObjectLikeRequestTemplate() {
    }

    public ObjectLikeRequestTemplate(String objectId, Short objectType, byte likeStatus) {
        super(objectId, objectType);
        this.likeStatus = likeStatus;
    }

    public byte getLikeStatus() {
        return likeStatus;
    }

    public void setLikeStatus(byte likeStatus) {
        this.likeStatus = likeStatus;
    }
}
