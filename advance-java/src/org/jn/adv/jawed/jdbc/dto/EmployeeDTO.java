package org.jn.adv.jawed.jdbc.dto;

import java.io.Serializable;
import java.util.Date;

public class EmployeeDTO implements Serializable{

	private static final long serialVersionUID = -1443814004539007341L;
	
	private Integer id;
	private Integer companyId;
	private String firstName;
	private String lastName;
	private Double salary;
	private Date dob;
	private String genderValue;
	private Integer age;
	private String name;
	private String dobString;
	private boolean gender;
	
	/**
	 * @return the gender
	 */
	public boolean isGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the companyId
	 */
	public Integer getCompanyId() {
		return companyId;
	}

	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the gender
	 */
	public String getGenderValue() {
		return genderValue;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGenderValue(String genderValue) {
		this.genderValue = genderValue;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dobString
	 */
	public String getDobString() {
		return dobString;
	}

	/**
	 * @param dobString the dobString to set
	 */
	public void setDobString(String dobString) {
		this.dobString = dobString;
	}

	@Override
	public String toString() {
		return "{id: "+id+", firstName: "+firstName+", lastName: "+lastName+", salary:  "+salary+ 
				", dob: "+dob+ ", gender: "+genderValue+", age: "+age+"}";
	}
}