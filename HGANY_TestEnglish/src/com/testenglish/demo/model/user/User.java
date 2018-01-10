package com.testenglish.demo.model.user;

import com.testenglish.demo.util.CustomStringUtils;

public class User {
	
	private String email;
	private String hashedPassword;
	private String name;
	private String gender;
	private String dateOfBirth;
	
	public User() {
		this.email = null;
		this.hashedPassword = null;
		this.name = null;
		this.gender = null;
		this.dateOfBirth = null;
	}
	
	public User(String email, String password, String name, String gender, String dateOfBirth) {
		this.email = email;
		hashedPassword = CustomStringUtils.hash256(password);
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getHashedPassword() {
		return hashedPassword;
	}
	
	public void setPassword(String password) {
		hashedPassword = CustomStringUtils.hash256(password);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}