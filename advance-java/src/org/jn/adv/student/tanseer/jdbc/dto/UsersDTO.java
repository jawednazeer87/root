package org.jn.adv.student.tanseer.jdbc.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class UsersDTO implements Serializable
{
	private static final long serialVersionUID = -1443814004539007341L;
	private Integer id;
	private String fullName;
	private String email;
	private boolean gender;
	private LocalDate dob;
	private Integer countryCode;
	private String createdAt;
	private String genderValue;
	private Integer age;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public Integer getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getGenderValue() {
		setGenderValue(genderValue);
		return genderValue;
	}
	public void setGenderValue(String genderValue) {
		if(genderValue == null) {
			this.genderValue = gender ? "Male" : "Female";
		}
		else {
			this.genderValue = genderValue;
		}
	}
	public Integer getAge() {
		setAge(age);
		return age;
	}
	public void setAge(Integer age) {
		if(age == null) {
			age = Period.between(dob, LocalDate.now()).getYears();
		}
		this.age = age;
	}
	
	@Override
	public String toString() {
		setGenderValue(genderValue);
		setAge(age);
		return "UsersDTO [id = ," + id + ", Full Name = " + fullName + " ,Email = " + email + ", gender = "
		+ genderValue + ", DOB = " + dob + ", Country Code = " + countryCode + ", Created At = " + createdAt + ", Age = " + age 
		  + "]"+"\r";
	}
	
}
