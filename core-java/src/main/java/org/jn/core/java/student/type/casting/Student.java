package org.jn.core.java.student.type.casting;

public class Student implements Cloneable{
	private int id;
	private String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void setId(int id)
	{
		this.id=id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	
	void getData() {
		System.out.println("Id: "+this.getId()+ " Name: "+this.getName());
	}
	
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
