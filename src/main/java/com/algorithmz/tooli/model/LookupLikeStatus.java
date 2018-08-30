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
 * @author Mostafa Salah
 */

@Document
public class LookupLikeStatus implements Serializable {

    private static final long serialVersionUID = 1L;
 
    @Id
    private String likeStatusId;
    private String likeStatus;
    private Set<ObjectLikes> objectLikesSet;

    public LookupLikeStatus() {
    }

    public LookupLikeStatus(String likeStatusId) {
        this.likeStatusId = likeStatusId;
    }

    public LookupLikeStatus(String likeStatusId, String likeStatus) {
        this.likeStatusId = likeStatusId;
        this.likeStatus = likeStatus;
    }

    public String getLikeStatusId() {
        return likeStatusId;
    }

    public void setLikeStatusId(String likeStatusId) {
        this.likeStatusId = likeStatusId;
    }

    public String getLikeStatus() {
        return likeStatus;
    }

    public void setLikeStatus(String likeStatus) {
        this.likeStatus = likeStatus;
    }

    public Set<ObjectLikes> getObjectLikesSet() {
        return objectLikesSet;
    }

    public void setObjectLikesSet(Set<ObjectLikes> objectLikesSet) {
        this.objectLikesSet = objectLikesSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (likeStatusId != null ? likeStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LookupLikeStatus)) {
            return false;
        }
        LookupLikeStatus other = (LookupLikeStatus) object;
        if ((this.likeStatusId == null && other.likeStatusId != null) || (this.likeStatusId != null && !this.likeStatusId.equals(other.likeStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vapps.withme.models.LookupLikeStatus[ likeStatusId=" + likeStatusId + " ]";
    }
    
}
