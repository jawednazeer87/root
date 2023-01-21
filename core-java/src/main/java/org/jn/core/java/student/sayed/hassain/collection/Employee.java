package org.jn.core.java.student.sayed.hassain.collection;

public class Employee {
	private String name;
	private String designation;
	
	Employee() { };
	Employee(String name, String designation)
	{
		this.name=name;
		this.designation=designation;
	}
	
	//setters
	void setName(String name) {
		this.name=name;
	}
	void setDesignation(String designation)
	{
		this.designation=designation;
	}
	
	//getters
	String getName() {
		return name;
	}
	String getDesignation() {
		return designation;
	}
	@Override
	public String toString() {
		return "{ Name: "+name+" Designation: "+designation+" }";
		
	}
	
	
	 
}
