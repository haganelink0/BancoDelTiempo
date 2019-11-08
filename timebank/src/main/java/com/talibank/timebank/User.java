package com.talibank.timebank;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class User {
	private String name;
	@Id
	private String email;
	private String birthDate;
	private int phoneNumber;
	private String location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public User(String name, String email, String birthDate, int phoneNumber, String location) {
		super();
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
		this.location = location;
	}
	
	public User(String email) {
		this.email = email;
	}
	
	public User() {
		
	}
	

}
