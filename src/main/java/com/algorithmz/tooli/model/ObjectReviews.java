/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithmz.tooli.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Mostafa Salah
 */
@Document
public class ObjectReviews implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String reviewId;
    private String objectId;
    private String reviewText;
    private String userId;
    private boolean discloseReviewer;
    private long noOfLikes;
    private long noOfDislikes;
    private short noOfReportings;
    private boolean isBanned;
    private Date creationDateTime;
    private Date editingDateTime;
    private Long orderId;
    private LookupObjectTypes objectTypeId;
    private Set<ObjectReviews> objectReviewsSet;
    private ObjectReviews parentReviewId;

    public ObjectReviews() {
    }

    public ObjectReviews(String reviewId) {
        this.reviewId = reviewId;
    }

    public ObjectReviews(String reviewId, String objectId, String reviewText, String userId, boolean discloseReviewer, long noOfLikes, long noOfDislikes, short noOfReportings, boolean isBanned, Date creationDateTime) {
        this.reviewId = reviewId;
        this.objectId = objectId;
        this.reviewText = reviewText;
        this.userId = userId;
        this.discloseReviewer = discloseReviewer;
        this.noOfLikes = noOfLikes;
        this.noOfDislikes = noOfDislikes;
        this.noOfReportings = noOfReportings;
        this.isBanned = isBanned;
        this.creationDateTime = creationDateTime;
    }

    public ObjectReviews(String objectId, String reviewText, boolean discloseReview, Date createdate, Long orderId, LookupObjectTypes objectType, ObjectReviews parentReview, String userId) {
        this.objectId = objectId;
        this.reviewText = reviewText;
        this.discloseReviewer = discloseReview;
        this.creationDateTime = createdate;
        this.orderId = orderId;
        this.objectTypeId = objectType;
        this.parentReviewId = parentReview;
        this.userId = userId;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean getDiscloseReviewer() {
        return discloseReviewer;
    }

    public void setDiscloseReviewer(boolean discloseReviewer) {
        this.discloseReviewer = discloseReviewer;
    }

    public long getNoOfLikes() {
        return noOfLikes;
    }

    public void setNoOfLikes(long noOfLikes) {
        this.noOfLikes = noOfLikes;
    }

    public long getNoOfDislikes() {
        return noOfDislikes;
    }

    public void setNoOfDislikes(long noOfDislikes) {
        this.noOfDislikes = noOfDislikes;
    }

    public short getNoOfReportings() {
        return noOfReportings;
    }

    public void setNoOfReportings(short noOfReportings) {
        this.noOfReportings = noOfReportings;
    }

    public boolean getIsBanned() {
        return isBanned;
    }

    public void setIsBanned(boolean isBanned) {
        this.isBanned = isBanned;
    }

    public Date getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public Date getEditingDateTime() {
        return editingDateTime;
    }

    public void setEditingDateTime(Date editingDateTime) {
        this.editingDateTime = editingDateTime;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public LookupObjectTypes getObjectTypeId() {
        return objectTypeId;
    }

    public void setObjectTypeId(LookupObjectTypes objectTypeId) {
        this.objectTypeId = objectTypeId;
    }

    public Set<ObjectReviews> getObjectReviewsSet() {
        return objectReviewsSet;
    }

    public void setObjectReviewsSet(Set<ObjectReviews> objectReviewsSet) {
        this.objectReviewsSet = objectReviewsSet;
    }

    public ObjectReviews getParentReviewId() {
        return parentReviewId;
    }

    public void setParentReviewId(ObjectReviews parentReviewId) {
        this.parentReviewId = parentReviewId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reviewId != null ? reviewId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ObjectReviews)) {
            return false;
        }
        ObjectReviews other = (ObjectReviews) object;
        if ((this.reviewId == null && other.reviewId != null) || (this.reviewId != null && !this.reviewId.equals(other.reviewId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vapps.withme.models.ObjectReviews[ reviewId=" + reviewId + " ]";
    }

}
