package org.jn.core.java.student.shoaeeeb.inheritance;

public class Teacher {

	private int id;
	private String name;
	private String address;
	private float sal;
	
	void setId(int id)
	{
		this.id=id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setAdress(String adress)
	{
		this.address=adress;
	}
	
	void setSal(float sal)
	{
		this.sal=sal;
	}

	
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	String getAddress() {
		return address;
	}
	float getSal() {
		return sal;
	}
	
}
