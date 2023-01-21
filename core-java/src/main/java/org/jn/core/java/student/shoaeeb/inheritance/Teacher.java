package org.jn.core.java.student.shoaeeb.inheritance;

public class Teacher {
	int id;
	String name;
	String address;
	float sal;
	
	//setters
	void setId(int id)
	{
		this.id=id;
	}
	void setName(String name) {
		this.name=name;
	}
	void setSal(float sal)
	{
		this.sal=sal;
	}
	
	void setAddress(String address)
	{
		this.address=address;
	}
	//getters
	int getId() {
		return id;
	}
	String getname() {
		return name;
	}
	String getAddress() {
		return address;
	}
	float getSal() {
		return sal;
	}
}
