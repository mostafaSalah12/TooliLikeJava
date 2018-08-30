/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithmz.tooli.model;

import java.io.Serializable;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author  Mostafa Salah
 */
@Document
public class LookupObjectTypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String objectTypeId;
    private String objectType;
    private Short viewingsRepetitionDuration;
    private Set<ObjectRatings> objectRatingsSet;
    private Set<ObjectViewings> objectViewingsSet;
    private Set<ObjectLikes> objectLikesSet;
    private Set<ObjectReviews> objectReviewsSet;

    public LookupObjectTypes() {
    }

    public LookupObjectTypes(String objectTypeId) {
        this.objectTypeId = objectTypeId;
    }

    public LookupObjectTypes(String objectTypeId, String objectType) {
        this.objectTypeId = objectTypeId;
        this.objectType = objectType;
    }

    public String getObjectTypeId() {
        return objectTypeId;
    }

    public void setObjectTypeId(String objectTypeId) {
        this.objectTypeId = objectTypeId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public Short getViewingsRepetitionDuration() {
        return viewingsRepetitionDuration;
    }

    public void setViewingsRepetitionDuration(Short viewingsRepetitionDuration) {
        this.viewingsRepetitionDuration = viewingsRepetitionDuration;
    }

    public Set<ObjectRatings> getObjectRatingsSet() {
        return objectRatingsSet;
    }

    public void setObjectRatingsSet(Set<ObjectRatings> objectRatingsSet) {
        this.objectRatingsSet = objectRatingsSet;
    }

    public Set<ObjectViewings> getObjectViewingsSet() {
        return objectViewingsSet;
    }

    public void setObjectViewingsSet(Set<ObjectViewings> objectViewingsSet) {
        this.objectViewingsSet = objectViewingsSet;
    }

    public Set<ObjectLikes> getObjectLikesSet() {
        return objectLikesSet;
    }

    public void setObjectLikesSet(Set<ObjectLikes> objectLikesSet) {
        this.objectLikesSet = objectLikesSet;
    }

    public Set<ObjectReviews> getObjectReviewsSet() {
        return objectReviewsSet;
    }

    public void setObjectReviewsSet(Set<ObjectReviews> objectReviewsSet) {
        this.objectReviewsSet = objectReviewsSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (objectTypeId != null ? objectTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LookupObjectTypes)) {
            return false;
        }
        LookupObjectTypes other = (LookupObjectTypes) object;
        if ((this.objectTypeId == null && other.objectTypeId != null) || (this.objectTypeId != null && !this.objectTypeId.equals(other.objectTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vapps.withme.models.LookupObjectTypes[ objectTypeId=" + objectTypeId + " ]";
    }
    
}
