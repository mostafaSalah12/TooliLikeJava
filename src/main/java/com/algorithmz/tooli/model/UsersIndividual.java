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
public class UsersIndividual implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String unverifiedEmail;
    private String emailVerificationCode;
    private String emailCodeLink;
    private Date emailCodeExpiry;
    private String unverifiedMobile;
    private String mobileVerificationCode;
    private String mobileCodeLink;
    private Date mobileCodeExpiry;
    private short smsSent;
    private Date birthdate;
    private Short genderId;
    private Short identificationTypeId;
    private String identificationNumber;
    private String identificationPhoto1;
    private String identificationPhoto2;
    private String facebookId;
    private String instagramId;
    private Short currencyId;
    private short countryId;
    private boolean receivePushNotification;
    private String mobileToken;
    private int noOfNotifications;
    private int noOfFollowingBrokers;
    private int noOfPreferredDomains;
    private boolean isSocial;
    private boolean isActivated;
    private short isVerified;
    private short isIdentified;
    private short isAuthorized;
    private short isProtected;
    private boolean isSecured;
    private boolean isAddressed;
    private short isBanked;
    private boolean isInvited;
    private Date activationDateTime;

    public UsersIndividual() {
    }

    public UsersIndividual(String userId) {
        this.userId = userId;
    }

    public UsersIndividual(String userId, String firstName, String lastName, short smsSent, short countryId, boolean receivePushNotification, int noOfNotifications, int noOfFollowingBrokers, int noOfPreferredDomains, boolean isSocial, boolean isActivated, short isVerified, short isIdentified, short isAuthorized, short isProtected, boolean isSecured, boolean isAddressed, short isBanked, boolean isInvited) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.smsSent = smsSent;
        this.countryId = countryId;
        this.receivePushNotification = receivePushNotification;
        this.noOfNotifications = noOfNotifications;
        this.noOfFollowingBrokers = noOfFollowingBrokers;
        this.noOfPreferredDomains = noOfPreferredDomains;
        this.isSocial = isSocial;
        this.isActivated = isActivated;
        this.isVerified = isVerified;
        this.isIdentified = isIdentified;
        this.isAuthorized = isAuthorized;
        this.isProtected = isProtected;
        this.isSecured = isSecured;
        this.isAddressed = isAddressed;
        this.isBanked = isBanked;
        this.isInvited = isInvited;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getUnverifiedEmail() {
        return unverifiedEmail;
    }

    public void setUnverifiedEmail(String unverifiedEmail) {
        this.unverifiedEmail = unverifiedEmail;
    }

    public String getEmailVerificationCode() {
        return emailVerificationCode;
    }

    public void setEmailVerificationCode(String emailVerificationCode) {
        this.emailVerificationCode = emailVerificationCode;
    }

    public String getEmailCodeLink() {
        return emailCodeLink;
    }

    public void setEmailCodeLink(String emailCodeLink) {
        this.emailCodeLink = emailCodeLink;
    }

    public Date getEmailCodeExpiry() {
        return emailCodeExpiry;
    }

    public void setEmailCodeExpiry(Date emailCodeExpiry) {
        this.emailCodeExpiry = emailCodeExpiry;
    }

    public String getUnverifiedMobile() {
        return unverifiedMobile;
    }

    public void setUnverifiedMobile(String unverifiedMobile) {
        this.unverifiedMobile = unverifiedMobile;
    }

    public String getMobileVerificationCode() {
        return mobileVerificationCode;
    }

    public void setMobileVerificationCode(String mobileVerificationCode) {
        this.mobileVerificationCode = mobileVerificationCode;
    }

    public String getMobileCodeLink() {
        return mobileCodeLink;
    }

    public void setMobileCodeLink(String mobileCodeLink) {
        this.mobileCodeLink = mobileCodeLink;
    }

    public Date getMobileCodeExpiry() {
        return mobileCodeExpiry;
    }

    public void setMobileCodeExpiry(Date mobileCodeExpiry) {
        this.mobileCodeExpiry = mobileCodeExpiry;
    }

    public short getSmsSent() {
        return smsSent;
    }

    public void setSmsSent(short smsSent) {
        this.smsSent = smsSent;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Short getGenderId() {
        return genderId;
    }

    public void setGenderId(Short genderId) {
        this.genderId = genderId;
    }

    public Short getIdentificationTypeId() {
        return identificationTypeId;
    }

    public void setIdentificationTypeId(Short identificationTypeId) {
        this.identificationTypeId = identificationTypeId;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationPhoto1() {
        return identificationPhoto1;
    }

    public void setIdentificationPhoto1(String identificationPhoto1) {
        this.identificationPhoto1 = identificationPhoto1;
    }

    public String getIdentificationPhoto2() {
        return identificationPhoto2;
    }

    public void setIdentificationPhoto2(String identificationPhoto2) {
        this.identificationPhoto2 = identificationPhoto2;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getInstagramId() {
        return instagramId;
    }

    public void setInstagramId(String instagramId) {
        this.instagramId = instagramId;
    }

    public Short getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Short currencyId) {
        this.currencyId = currencyId;
    }

    public short getCountryId() {
        return countryId;
    }

    public void setCountryId(short countryId) {
        this.countryId = countryId;
    }

    public boolean getReceivePushNotification() {
        return receivePushNotification;
    }

    public void setReceivePushNotification(boolean receivePushNotification) {
        this.receivePushNotification = receivePushNotification;
    }

    public String getMobileToken() {
        return mobileToken;
    }

    public void setMobileToken(String mobileToken) {
        this.mobileToken = mobileToken;
    }

    public int getNoOfNotifications() {
        return noOfNotifications;
    }

    public void setNoOfNotifications(int noOfNotifications) {
        this.noOfNotifications = noOfNotifications;
    }

    public int getNoOfFollowingBrokers() {
        return noOfFollowingBrokers;
    }

    public void setNoOfFollowingBrokers(int noOfFollowingBrokers) {
        this.noOfFollowingBrokers = noOfFollowingBrokers;
    }

    public int getNoOfPreferredDomains() {
        return noOfPreferredDomains;
    }

    public void setNoOfPreferredDomains(int noOfPreferredDomains) {
        this.noOfPreferredDomains = noOfPreferredDomains;
    }

    public boolean getIsSocial() {
        return isSocial;
    }

    public void setIsSocial(boolean isSocial) {
        this.isSocial = isSocial;
    }

    public boolean getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(boolean isActivated) {
        this.isActivated = isActivated;
    }

    public short getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(short isVerified) {
        this.isVerified = isVerified;
    }

    public short getIsIdentified() {
        return isIdentified;
    }

    public void setIsIdentified(short isIdentified) {
        this.isIdentified = isIdentified;
    }

    public short getIsAuthorized() {
        return isAuthorized;
    }

    public void setIsAuthorized(short isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    public short getIsProtected() {
        return isProtected;
    }

    public void setIsProtected(short isProtected) {
        this.isProtected = isProtected;
    }

    public boolean getIsSecured() {
        return isSecured;
    }

    public void setIsSecured(boolean isSecured) {
        this.isSecured = isSecured;
    }

    public boolean getIsAddressed() {
        return isAddressed;
    }

    public void setIsAddressed(boolean isAddressed) {
        this.isAddressed = isAddressed;
    }

    public short getIsBanked() {
        return isBanked;
    }

    public void setIsBanked(short isBanked) {
        this.isBanked = isBanked;
    }

    public boolean getIsInvited() {
        return isInvited;
    }

    public void setIsInvited(boolean isInvited) {
        this.isInvited = isInvited;
    }

    public Date getActivationDateTime() {
        return activationDateTime;
    }

    public void setActivationDateTime(Date activationDateTime) {
        this.activationDateTime = activationDateTime;
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
        if (!(object instanceof UsersIndividual)) {
            return false;
        }
        UsersIndividual other = (UsersIndividual) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vapps.withme.models.UsersIndividual[ userId=" + userId + " ]";
    }
    
}
