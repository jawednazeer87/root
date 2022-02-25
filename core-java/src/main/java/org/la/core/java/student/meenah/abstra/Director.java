package org.la.core.java.student.meenah.abstra;

public class Director extends Employee {

	
	@Override
	public void name() {
		System.out.println("Oveeride name method from director child class");
	}
	
	@Override
	public void child() {
		System.out.println(" Override abstract method from director child class");
	}
}
