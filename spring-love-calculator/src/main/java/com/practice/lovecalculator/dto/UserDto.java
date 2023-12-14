package com.practice.lovecalculator.dto;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UserDto {

	public UserDto() {
		System.out.println("UserDto Constructor called...");
	}

	@NotBlank(message = "User Name should not be blank")
	@NotNull(message = "User Name should not be Null")
	private String userName;

	@NotBlank(message = "User Name should not be blank")
	@NotNull(message = "User Name should not be Null")
//	@Min(value = 2)
	private String crushName;
	
	@AssertTrue(message = "Must agree to our terms to proceed further")
	private boolean termsAndCondition;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	public boolean isTermsAndCondition() {
		return termsAndCondition;
	}

	public void setTermsAndCondition(boolean termsAndCondition) {
		this.termsAndCondition = termsAndCondition;
	}
	
	

}
