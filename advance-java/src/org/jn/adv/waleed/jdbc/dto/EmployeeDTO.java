package org.jn.adv.waleed.jdbc.dto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 * @author Waleed Rizq
 *
 * @date Mar 13, 2022
 */
public class EmployeeDTO {
 private static final long serialVersionUID = -1443814004539007341L;
	
	private Integer id;
	private Integer companyId;
	private String firstName;
	private String lastName;
	private Double salary;
	private LocalDate dob;
	private String genderValue;
	private Integer age;
	private String name;
	private String dobString;
	private boolean gender;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGenderValue() {
		setGenderValue(genderValue);
		return genderValue;
	}
	public void setGenderValue(String genderValue) {
		if(genderValue==null) {
			this.genderValue = gender ? "male" : "female";
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
		if(age==null) {
			age = Period.between(dob, LocalDate.now()).getYears();
		}
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDobString() {
		return dobString;
	}
	public void setDobString(String dobString) {
		this.dobString = dobString;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		setGenderValue(genderValue);
		setAge(age);
		return "EmployeeDTO [id=" + id + ", companyId=" + companyId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", salary=" + salary + ", dob=" + dob + ", age=" + age + ", name=" + name + ", gender="+genderValue
				  + "]"+"\r";
	}

}
