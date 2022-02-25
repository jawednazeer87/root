package org.la.core.java.student.meenah.clss;

import org.la.core.java.student.meenah.abstra.Employee;

public class SecurityEmpl extends Employee {

	
	@Override
	public void name() {
		System.out.println("Oveeride name method from security child class");
	}
	
	@Override
	public void child() {
		System.out.println(" Override abstract method from secuirty child class");
	}
}
