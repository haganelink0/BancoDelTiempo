package com.talibank.timebank;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="jobs")
public class Job {
	@Id
	private int id;
	private String category;
	private String userId;
	private String userName;
	private String description;
	private String disponibility;
	private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDisponibility() {
		return disponibility;
	}
	public void setDisponibility(String disponibility) {
		this.disponibility = disponibility;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Job(int id, String category, String userId, String userName, String description, String disponibility,
			String state) {
		super();
		this.id = id;
		this.category = category;
		this.userId = userId;
		this.userName = userName;
		this.description = description;
		this.disponibility = disponibility;
		this.state = state;
	}
	public Job(int id) {
		super();
		this.id = id;
	}
	public Job() {
		super();
	}
	
	

}
