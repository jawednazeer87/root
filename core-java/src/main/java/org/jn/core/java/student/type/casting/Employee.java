package org.jn.core.java.student.type.casting;

public class Employee implements Cloneable{
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	String getName() {
		return name;
	}
	int getId() {
		return id;
	}
	
	void getData() {
		System.out.println("Id: "+this.getId()+" Name: "+this.getName());
	}
	
	Object myClone() throws CloneNotSupportedException {
		return super.clone();
	}
}
