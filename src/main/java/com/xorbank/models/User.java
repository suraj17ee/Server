package com.xorbank.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdata")
public class User {				
	
	@Id
	private int userid;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String email;
	@Column
	private int mobile;
	@Column
	private String dateofbirth;
	@Column
	private String gender;
	@Column
	private String password;


	public User(){}
	
	public User(int userid, String firstname, String lastname, String email, int mobile,
			String dateofbirth, String gender, String password) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobile = mobile;
		this.dateofbirth = dateofbirth;
		this.gender = gender;
		this.password = password;
	}


	
	public int getUserid() {
		return userid;
	}

	
	  public void setUserid(int userid) { this.userid = userid; }
	 
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
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
		return "User [userID=" + userid + ", firstName=" + firstname + ", lastName=" + lastname + ", email="
				+ email + ", mobileNo=" + mobile + ", dateOfBirth=" + dateofbirth + ", gender=" + gender
				+ ", password=" + password + "]";
	}
	
}
