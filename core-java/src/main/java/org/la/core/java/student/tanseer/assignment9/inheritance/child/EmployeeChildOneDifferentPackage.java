package org.la.core.java.student.tanseer.assignment9.inheritance.child;

import org.la.core.java.student.tanseer.assignment9.inheritance.parent.Employee;

public class EmployeeChildOneDifferentPackage extends Employee
{
	@Override
	protected void name() {
		// TODO Auto-generated method stub
		super.name();
		System.out.println();
		System.out.println("above method is called from parent employee class");
		System.out.println("This is child 1 of employee class of different package, name() method");
		System.out.println();
	}
	@Override
	protected void child() {
		// TODO Auto-generated method stub
		super.child();
		System.out.println("above method is called from parent employee class");
		System.out.println("This is child 1 of employee class of different package, child() method");
	}
}
