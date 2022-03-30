package org.jn.adv.student.moshin.jdbc.model;

import java.time.LocalDate;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class Users {
	
	private Integer id;
	private String fullName;
	private boolean gender;
	private LocalDate dob;
	private String countryCode;
	private LocalDate createdAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", fullName=" + fullName + ", gender=" + gender + ", dob=" + dob + ", countryCode="
				+ countryCode + ", createdAt=" + createdAt + "]";
	}
	
	
	
	

}
