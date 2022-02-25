package org.la.core.java.student.meenah.clss;

import org.la.core.java.student.meenah.abstra.Employee;

public class AssistantEmp extends Employee{

	@Override
	public void name() {
		System.out.println("Oveeride name method from assistant child class");
	}
	
	@Override
	public void child() {
		System.out.println(" Override abstract method from assistant child class");
	}
}
