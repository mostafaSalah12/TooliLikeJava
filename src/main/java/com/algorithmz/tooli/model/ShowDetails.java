package com.algorithmz.tooli.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ShowDetails {
	@Id
	private String id;
	private String showName; // جايلى 
	private String showId;// جايلى
	private String showDetails;//جايلى
	private Date showDate=new Date();
	private String channelId;//جايلى
	private String channelName;//جايلى
	private Long totalNumderLikes;
	private Long totalNumberOfDislike;
	private Integer rate;
	private Integer rateNumber;   
	private Long totalNumberOfRaters; // calc
	
	private List<String> usersLiked;     
	private List<String> usersDisLiked;
	private List<String> usersReated;    //userid and count
	
	public ShowDetails() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getShowDetails() {
		return showDetails;
	}

	public void setShowDetails(String showDetails) {
		this.showDetails = showDetails;
	}

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Long getTotalNumderLikes() {
		return totalNumderLikes;
	}

	public void setTotalNumderLikes(Long totalNumderLikes) {
		this.totalNumderLikes = totalNumderLikes;
	}

	public Long getTotalNumberOfDislike() {
		return totalNumberOfDislike;
	}

	public void setTotalNumberOfDislike(Long totalNumberOfDislike) {
		this.totalNumberOfDislike = totalNumberOfDislike;
	}




	public String getShowId() {
		return showId;
	}

	public void setShowId(String showId) {
		this.showId = showId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public List<String> getUsersLiked() {
		return usersLiked;
	}

	public void setUsersLiked(List<String> usersLiked) {
		this.usersLiked = usersLiked;
	}

	public List<String> getUsersDisLiked() {
		return usersDisLiked;
	}

	public void setUsersDisLiked(List<String> usersDisLiked) {
		this.usersDisLiked = usersDisLiked;
	}

	public List<String> getUsersReated() {
		return usersReated;
	}

	public void setUsersReated(List<String> usersReated) {
		this.usersReated = usersReated;
	}
	
	
	

}
