package org.la.core.java.student.meenah.clss;

import org.la.core.java.student.meenah.abstra.Employee;

public class SecondManger extends Employee {

	
	@Override
	public void name() {
		System.out.println("Oveeride name method from secondmanger child class");
	}
	
	@Override
	public void child() {
		System.out.println(" Override abstract method from secondmanger child class");
	}
}
