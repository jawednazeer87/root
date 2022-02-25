package org.la.core.java.student.meenah.abstra;

public class MangerEmply extends Employee{

	@Override
	public void name() {
		System.out.println("Oveeride name method from manger child class");
	}
	
	@Override
	public void child() {
		System.out.println(" Override abstract method from manger child class");
	}
}
