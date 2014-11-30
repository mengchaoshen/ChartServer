package com.model;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = -8603850515164057242L;
	
	private String studyId;
	
	private String userName;
	
	private String password;

	public User() {
		super();
	}


	public User(String studyId, String userName) {
		super();
		this.studyId = studyId;
		this.userName = userName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStudyId() {
		return studyId;
	}

	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}

	
}
