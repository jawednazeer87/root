package org.jn.core.java.student.shoaeeb.polymorphism;

public class Domestic {
	String name;
	final float C = 2.50f;
	
	void setName(String name) {
		this.name=name;
	}
	
	String getName() {
		return name;
	}
	
	void calculate(float units)
	{
		System.out.println("Domestic bill is: "+units*C);
	}
}
