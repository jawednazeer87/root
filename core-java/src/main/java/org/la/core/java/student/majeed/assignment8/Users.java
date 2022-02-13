package org.la.core.java.student.majeed.assignment8;

import java.util.Date;

/*
12.	Create a class Users having member variables id, fullName, email, gender, dateOfBirth, countryCode, createdAt. 
create getters and setters for all member variables. Create object of Users class in other 
class inside main method and set all member values and print all member values using getters.
 */

public class Users {
	private int id;
	private String fullName; 
	private String email;
	private String gender;
	private Date dateOfBirth;
	private String countryCode;
	private String createdAt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
		
}
