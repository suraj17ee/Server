package com.xorbank.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {				
	
	@Id
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private int mobileNo;
	private LocalDate dateOfBirth;
	private String gender;
	private String password;

	
	public User(String username, String firstName, String lastName, String email, int mobileNo,
			LocalDate dateOfBirth, String gender, String password) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.password = password;
	}


	public User(){}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", mobileNo=" + mobileNo + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", password=" + password + "]";
	}
	
}
