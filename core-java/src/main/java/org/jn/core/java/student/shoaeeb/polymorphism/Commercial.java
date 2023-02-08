package org.jn.core.java.student.shoaeeb.polymorphism;

public class Commercial {

	String name;
	final float C=5.00f;
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	
	void calculate(float units) {
		System.out.println(this.getName()+ " Electricity: "+(units*C));
	}
	

}
