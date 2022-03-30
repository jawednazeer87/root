package org.jn.adv.student.moshin.jdbc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Waleed Rizq
 *
 * @date Mar 13, 2022
 */
//POJO - Plain Old Java Object
public class Employee implements Serializable {
	private static final long serialVersionUID = -1443814004539007341L;
	
	
	private Integer id;
	private Integer companyId;
	private String firstName;
	private String lastName;
	private Double salary;
	private Date dob;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean getGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", companyId=" + companyId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", dob=" + dob + ", gender=" + gender + "]"+"\r";
	}

	/*
	@Override
	public String toString() {
		return "Employee [id=" + id +  ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary  + "]"+"\r";
	}
	*/
	

}
