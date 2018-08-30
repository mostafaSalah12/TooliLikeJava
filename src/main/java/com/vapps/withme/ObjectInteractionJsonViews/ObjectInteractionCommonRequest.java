package com.vapps.withme.ObjectInteractionJsonViews;

import com.algorithmz.tooli.view.PageableCommonRequest;

/**
 * Created by kmagdy on 8/13/2017.
 */
public class ObjectInteractionCommonRequest extends PageableCommonRequest {

    protected String objectId;
    protected Short objectType;
    protected Long userId;

    public ObjectInteractionCommonRequest() {
    }

    public ObjectInteractionCommonRequest(String objectId, Short objectType) {
        this.objectId = objectId;
        this.objectType = objectType;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public Short getObjectType() {
        return objectType;
    }

    public void setObjectType(Short objectType) {
        this.objectType = objectType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
