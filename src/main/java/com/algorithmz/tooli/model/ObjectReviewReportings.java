/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithmz.tooli.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Mostafa Salah
 */
@Document
public class ObjectReviewReportings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String reportingId;
    private String reviewId;
    private String userId;
    private Date reportingDateTime;

    public ObjectReviewReportings() {
    }

    public ObjectReviewReportings(String reportingId) {
        this.reportingId = reportingId;
    }

    public ObjectReviewReportings(String reportingId, String reviewId, String userId, Date reportingDateTime) {
        this.reportingId = reportingId;
        this.reviewId = reviewId;
        this.userId = userId;
        this.reportingDateTime = reportingDateTime;
    }

    public ObjectReviewReportings(String reviewId, String userId, Date creation) {
        this.userId = userId;
        this.reviewId = reviewId;
        this.reportingDateTime = creation;
    }

    public String getReportingId() {
        return reportingId;
    }

    public void setReportingId(String reportingId) {
        this.reportingId = reportingId;
    }

   

    public String getReviewId() {
		return reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getReportingDateTime() {
        return reportingDateTime;
    }

    public void setReportingDateTime(Date reportingDateTime) {
        this.reportingDateTime = reportingDateTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reportingId != null ? reportingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ObjectReviewReportings)) {
            return false;
        }
        ObjectReviewReportings other = (ObjectReviewReportings) object;
        if ((this.reportingId == null && other.reportingId != null) || (this.reportingId != null && !this.reportingId.equals(other.reportingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vapps.withme.models.ObjectReviewReportings[ reportingId=" + reportingId + " ]";
    }

}
