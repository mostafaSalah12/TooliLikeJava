/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithmz.tooli.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Mostafa Salah
 */
@Document
public class ObjectLikes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String likeId;
    private String objectId;
    private LookupObjectTypes objectTypeId;   // شيل دى
    private Users userId;
    private LookupLikeStatus likeStatusId;

    public ObjectLikes() {
    }

    public ObjectLikes(String likeId) {
        this.likeId = likeId;
    }

    public ObjectLikes(String likeId, String objectId) {
        this.likeId = likeId;
        this.objectId = objectId;
    }

    public ObjectLikes(String objectId, LookupObjectTypes objectTypes, Users users, LookupLikeStatus likeStatus) {
        this.objectId = objectId;
        this.objectTypeId = objectTypes;
        this.userId = users;
        this.likeStatusId = likeStatus;
    }

    public String getLikeId() {
        return likeId;
    }

    public void setLikeId(String likeId) {
        this.likeId = likeId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public LookupObjectTypes getObjectTypeId() {
        return objectTypeId;
    }

    public void setObjectTypeId(LookupObjectTypes objectTypeId) {
        this.objectTypeId = objectTypeId;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public LookupLikeStatus getLikeStatusId() {
        return likeStatusId;
    }

    public void setLikeStatusId(LookupLikeStatus likeStatusId) {
        this.likeStatusId = likeStatusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (likeId != null ? likeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ObjectLikes)) {
            return false;
        }
        ObjectLikes other = (ObjectLikes) object;
        if ((this.likeId == null && other.likeId != null) || (this.likeId != null && !this.likeId.equals(other.likeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vapps.withme.models.ObjectLikes[ likeId=" + likeId + " ]";
    }

}
