package com.model;

import java.io.Serializable;
import java.util.List;

public class ResponseBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 222719529476268048L;

	private boolean success;
	
	private boolean correct;
	
	private String errorMsg;
	
	private String userName;
	
	private String studyId;
	
	private List<User> userList;

	public ResponseBean() {
		super();
	}

	public ResponseBean(boolean success) {
		super();
		this.success = success;
	}

	public ResponseBean(boolean success, boolean correct, String errorMsg,
			String userName) {
		super();
		this.success = success;
		this.correct = correct;
		this.errorMsg = errorMsg;
		this.userName = userName;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStudyId() {
		return studyId;
	}

	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
}
