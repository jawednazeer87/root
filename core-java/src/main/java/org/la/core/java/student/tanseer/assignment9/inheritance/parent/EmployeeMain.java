package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

import org.la.core.java.student.tanseer.assignment9.inheritance.child.EmployeeChildOneDifferentPackage;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Employee emp = new EmployeeChildOneSamePackage();
		emp.name();
		emp.child();
		
		System.out.println();
		
		emp = new EmployeeChildOneDifferentPackage();
		emp.name();
		emp.child();
	}
}
