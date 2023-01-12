package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class Users {

	int id;
	int countryCode;
	String fullName;
	String email;
	String gender;
	String dateOfBirth;
	String createdAt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", countryCode=" + countryCode + ", fullName=" + fullName + ", email=" + email
				+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", createdAt=" + createdAt + "]";
	}
	
	
}
