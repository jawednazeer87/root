package org.jn.core.java.student.mirza.baig.clss.object;

import java.time.LocalDate;
import java.util.Date;

public class Users {


	private String fullName;
	private String email;
	private String gender;
	
	private LocalDate dateOfBirth;
	private String countryCode;
	private Date createdAt;
	
 public void setFullName(String fullName) {
	 
	 this.fullName=fullName;
 }
 public String getFullName() {
	return fullName;
	 
 }
 public void setEmial(String email) {
	 
	 this.email=email;
 }
 public String getEmail() {
	 return email;
 }
 public void setGender(String gender) {
	 this.gender=gender;
	 
 }
public String getGender() {
	return gender;
	
	
}
public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth=dateOfBirth;
}
public LocalDate getDateOfBirth() {
	return dateOfBirth;
	
}
public void setCountryCode(String countryCode) {
	
	this.countryCode=countryCode;
}
public String getCountryCode() {
	return countryCode;
	
}
public void setCreated(Date createdAt) {
	this.createdAt=createdAt;
}
public Date getCreatedAt() {
	return createdAt;
	
}
}
	


//
//Create a class Users having member variables id, fullName, email, gender, dateOfBirth, countryCode, createdAt. 
//create getters and setters for all member variables. Create object of Users class in other class inside main 
//method and set all member values and print all member values using getters.