package com.model;

import javax.persistence.*;
@Entity
public class User {

	@Id
	private String userId;
	private String email;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userId, String email) {
		super();
		this.userId = userId;
		this.email = email;
	}
	
	
	
}
