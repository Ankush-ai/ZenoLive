package com.WebRTC.VideoChatApp.User;

import lombok.Builder;

@Builder
public class User {

	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", password=" + password + ", status=" + status
				+ "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String email, String password, String status) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.status = status;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private String userName;
	private String email;
	private String password;
	private String status;

}
