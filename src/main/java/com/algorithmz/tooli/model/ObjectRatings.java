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
public class ObjectRatings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String ratingId;
    private String objectId;
    private short rating;
    private String orderId;
    private LookupObjectTypes objectTypeId;
    private Users userId;

    public ObjectRatings() {
    }

    public ObjectRatings(String ratingId) {
        this.ratingId = ratingId;
    }

    public ObjectRatings(String ratingId, String objectId, short rating) {
        this.ratingId = ratingId;
        this.objectId = objectId;
        this.rating = rating;
    }

    public ObjectRatings(String objectId, byte ratingValue, String orderId, LookupObjectTypes objectTypes, Users user) {
        this.objectId = objectId;
        this.rating = ratingValue;
        this.orderId = orderId;
        this.objectTypeId = objectTypes;
        this.userId = user;
    }

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public short getRating() {
        return rating;
    }

    public void setRating(short rating) {
        this.rating = rating;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ratingId != null ? ratingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ObjectRatings)) {
            return false;
        }
        ObjectRatings other = (ObjectRatings) object;
        if ((this.ratingId == null && other.ratingId != null) || (this.ratingId != null && !this.ratingId.equals(other.ratingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vapps.withme.models.ObjectRatings[ ratingId=" + ratingId + " ]";
    }

}
