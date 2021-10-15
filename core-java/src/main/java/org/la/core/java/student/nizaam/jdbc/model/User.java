package org.la.core.java.student.nizaam.jdbc.model;

public class User {
	
	private int Id;
	private String name;
	private String email;
	private int age;
	
	public User() {}
	public User(int id, String name, String email, int age) {
		this.Id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	 @Override
	    public String toString() {
	        return "User{" +
	                "id=" + Id +
	                ", name='" + name + '\'' +
	                ", email='" + email + '\'' +
	                ", age=" + age +
	                '}';
	    }
	

}
