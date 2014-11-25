package com.model;

import java.io.Serializable;

public class ResponseBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 222719529476268048L;

	private boolean success;
	
	private boolean correct;
	
	private String errorMsg;
	
	private String userName;

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
	
	
	
}
