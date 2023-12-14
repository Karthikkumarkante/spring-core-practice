package com.practice.lovecalculator.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import com.practice.lovecalculator.customValidators.Age;

import jakarta.validation.constraints.NotEmpty;

public class RegistrationDto {
	@NotEmpty
	private String name ;//= "Karthik";
	private String userName;// = "Kkk";
	private char[] password;// = new char[] { 'k', 'k', 'k' };
	private String country;// = "USA";
	private String[] hobby;// = new String[] { "read", "cricket", "code" };
	private String gender;// = "male";
	private CommunicationDto communicationDto;
	private Date date;//=LocalDateTime.now();
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Age(min=18,max=50,message="{custom.validation.messages.age}")
	private int age;
	
	
	

	

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public CommunicationDto getCommunicationDto() {
		return communicationDto;
	}

	public void setCommunicationDto(CommunicationDto communicationDto) {
		this.communicationDto = communicationDto;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	
	
	
}
