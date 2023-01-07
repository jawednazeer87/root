package org.jn.core.java.student.sayed.hassain.clss;

public class Users {
	
	private int id;
	private String fullName;
	private String email;
	private String gender;
	private String dateOfBirth;
	private int countryCode;
	private String createdAt;
	
	public int getterId() {
		return id;
	}
	public String getterFullName() {
		return fullName;
	}
	public String getterEmail() {
		return email;
	}
	public String getterGender() {
		return gender;
	}
	public String getterDateOfBirth() {
		return dateOfBirth;
	}
	public int getterCountryCode() {
		return countryCode;
	}
	public String getterCreatedAt() {
		return createdAt;
	}
	public void setterId(int id) {
		this.id=id;
	}
	public void setterFullName(String fullName) {
		this.fullName=fullName;
	}
	public void setterEmail(String email) {
		this.email=email;
	}
	public void setterGender(String gender) {
		this.gender=gender;
	}
	public void setterDateOfBirth(String dateOfBirth) {
		this.dateOfBirth=dateOfBirth;
	}
	public void setterCountryCode(int countryCode) {
		this.countryCode=countryCode;
	}
	public void setterCreatedAt(String createdAt) {
		this.createdAt=createdAt;
	}
	

}
