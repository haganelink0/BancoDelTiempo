package com.talibank.timebank;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="history")
public class History {
	@Id
	private int id;
	private User alphaUser;
	private User betaUser;
	private Job job;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getAlphaUser() {
		return alphaUser;
	}
	public void setAlphaUser(User alphaUser) {
		this.alphaUser = alphaUser;
	}
	public User getBetaUser() {
		return betaUser;
	}
	public void setBetaUser(User betaUser) {
		this.betaUser = betaUser;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public History(int id, User alphaUser, User betaUser, Job job, String status) {
		super();
		this.id = id;
		this.alphaUser = alphaUser;
		this.betaUser = betaUser;
		this.job = job;
		this.status = status;
	}
	
	public History(int id) {
		this.id = id;
	}
	
	public History() {
		
	}

}
