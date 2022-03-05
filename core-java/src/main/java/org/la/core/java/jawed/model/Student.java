package org.la.core.java.jawed.model;

/**
 * @author jawednazeer
 */
public class Student {
	private Integer id;
	private Integer age;
	private String roll;
	private String name;
	private String email;
	private String school;
	private String standard;
	private Double weight;
	
	/**
	 * default/zero argument constructor
	 */
	public Student() {}

	/**
	 * @param id
	 * @param roll
	 * @param age
	 * @param name
	 * @param email
	 * @param school
	 * @param standard
	 * @param weight
	 */
	public Student(Integer id, String roll, Integer age, String name, String email, String school, String standard,
			Double weight) {
		this.id = id;
		this.roll = roll;
		this.age = age;
		this.name = name;
		this.email = email;
		this.school = school;
		this.standard = standard;
		this.weight = weight;
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
	 * @return the roll
	 */
	public String getRoll() {
		return roll;
	}

	/**
	 * @param roll the roll to set
	 */
	public void setRoll(String roll) {
		this.roll = roll;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * @return the standard
	 */
	public String getStandard() {
		return standard;
	}

	/**
	 * @param standard the standard to set
	 */
	public void setStandard(String standard) {
		this.standard = standard;
	}

	/**
	 * @return the weight
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "{id: " + id + ", age: " + age + ", roll: " + roll + ", name: " + name + ", email: " + email
				+ ", school: " + school + ", standard: " + standard + ", weight: " + weight + "}";
	}
	
	
}
