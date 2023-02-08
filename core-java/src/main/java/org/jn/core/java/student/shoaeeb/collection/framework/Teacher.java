package org.jn.core.java.student.shoaeeb.collection.framework;

public class Teacher {
	private int id;
	private String name;
	private String adress;
	private float salary;
	
	
	Teacher() {
		
	}
	//getters
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	String getAdress() {
		return adress;
	}
	float getSalary() {
		return salary;
	}
	//setters
	
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
		this.adress=adress;
	}
	void setSalary(float salary)
	{
		this.salary=salary;
	}

	



	Teacher(int id,String name,String adress,float salary)
	{
		this.id=id;
		this.name=name;
		this.adress=adress;
		this.salary=salary;
	}
	

	
	
}
