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
public class ObjectViewings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String viewingId;
    private String objectId;
    private Date viewingDateTime;
    private LookupObjectTypes objectTypeId;
    private Users actingUserId;

    public ObjectViewings() {
    }

    public ObjectViewings(String viewingId) {
        this.viewingId = viewingId;
    }

    public ObjectViewings(String viewingId, String objectId, Date viewingDateTime) {
        this.viewingId = viewingId;
        this.objectId = objectId;
        this.viewingDateTime = viewingDateTime;
    }

    public ObjectViewings(String objectId, Date date, LookupObjectTypes objectTypes, Users user) {
        this.objectId = objectId;
        this.viewingDateTime = date;
        this.objectTypeId = objectTypes;
        this.actingUserId = user;

    }

    public String getViewingId() {
        return viewingId;
    }

    public void setViewingId(String viewingId) {
        this.viewingId = viewingId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public Date getViewingDateTime() {
        return viewingDateTime;
    }

    public void setViewingDateTime(Date viewingDateTime) {
        this.viewingDateTime = viewingDateTime;
    }

    public LookupObjectTypes getObjectTypeId() {
        return objectTypeId;
    }

    public void setObjectTypeId(LookupObjectTypes objectTypeId) {
        this.objectTypeId = objectTypeId;
    }

    public Users getActingUserId() {
        return actingUserId;
    }

    public void setActingUserId(Users actingUserId) {
        this.actingUserId = actingUserId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (viewingId != null ? viewingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ObjectViewings)) {
            return false;
        }
        ObjectViewings other = (ObjectViewings) object;
        if ((this.viewingId == null && other.viewingId != null) || (this.viewingId != null && !this.viewingId.equals(other.viewingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vapps.withme.models.ObjectViewings[ viewingId=" + viewingId + " ]";
    }

}
