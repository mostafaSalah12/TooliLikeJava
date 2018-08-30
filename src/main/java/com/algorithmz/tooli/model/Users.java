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
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String userId;
    private String userName;
    private String email;
    private String mobile;
    private String firstName;
    private String lastName;
    private String password;
    private String forgotPasswordCode;
    private String forgotPasswordCodeLink;
    private Date forgotPasswordCodeExpiry;
    private String profilePhoto;
    private String profileThumbnail;
    private short languageId;
    private short userTypeId;
    private boolean isBlocked;
    private Date creationDateTime;
    private Date lastLoginDateTime;
    private Date lastFailedLoginDateTime;
    private String lastLoginIp;
    private short failedLoginAttempts;
    private String comments;
    private Set<ObjectRatings> objectRatingsSet;
    private Set<ObjectViewings> objectViewingsSet;
    private Set<ObjectLikes> objectLikesSet;

    public Users() {
    }

    public Users(String userId) {
        this.userId = userId;
    }

    public Users(String userId, String userName, String firstName, String lastName, String password, short languageId, short userTypeId, boolean isBlocked, Date creationDateTime, short failedLoginAttempts) {
        this.userId = userId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.languageId = languageId;
        this.userTypeId = userTypeId;
        this.isBlocked = isBlocked;
        this.creationDateTime = creationDateTime;
        this.failedLoginAttempts = failedLoginAttempts;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getForgotPasswordCode() {
        return forgotPasswordCode;
    }

    public void setForgotPasswordCode(String forgotPasswordCode) {
        this.forgotPasswordCode = forgotPasswordCode;
    }

    public String getForgotPasswordCodeLink() {
        return forgotPasswordCodeLink;
    }

    public void setForgotPasswordCodeLink(String forgotPasswordCodeLink) {
        this.forgotPasswordCodeLink = forgotPasswordCodeLink;
    }

    public Date getForgotPasswordCodeExpiry() {
        return forgotPasswordCodeExpiry;
    }

    public void setForgotPasswordCodeExpiry(Date forgotPasswordCodeExpiry) {
        this.forgotPasswordCodeExpiry = forgotPasswordCodeExpiry;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getProfileThumbnail() {
        return profileThumbnail;
    }

    public void setProfileThumbnail(String profileThumbnail) {
        this.profileThumbnail = profileThumbnail;
    }

    public short getLanguageId() {
        return languageId;
    }

    public void setLanguageId(short languageId) {
        this.languageId = languageId;
    }

    public short getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(short userTypeId) {
        this.userTypeId = userTypeId;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public Date getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public Date getLastLoginDateTime() {
        return lastLoginDateTime;
    }

    public void setLastLoginDateTime(Date lastLoginDateTime) {
        this.lastLoginDateTime = lastLoginDateTime;
    }

    public Date getLastFailedLoginDateTime() {
        return lastFailedLoginDateTime;
    }

    public void setLastFailedLoginDateTime(Date lastFailedLoginDateTime) {
        this.lastFailedLoginDateTime = lastFailedLoginDateTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public short getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    public void setFailedLoginAttempts(short failedLoginAttempts) {
        this.failedLoginAttempts = failedLoginAttempts;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vapps.withme.models.Users[ userId=" + userId + " ]";
    }
    
}
