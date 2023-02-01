package org.jn.core.java.student.shoaeeb.lambda;

public class Employee {
	private int id;
	private String name;
	private float sal;
	
	Employee() {
		
	}
	Employee(int id,String name,float sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	void setId(int id)
	{
		this.id=id;
	}
	void setName() {
		this.name=name;
	}
	void setSal() {
		this.sal=sal;
	}
	
	
	int getId()
	{
		return id;
	}
	String getName() {
		return name;
	}
	float getSal() {
		return sal;
	}
	
}
