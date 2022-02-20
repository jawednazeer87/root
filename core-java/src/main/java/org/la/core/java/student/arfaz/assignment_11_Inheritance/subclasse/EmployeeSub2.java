package org.la.core.java.student.arfaz.assignment_11_Inheritance.subclasse;

import org.la.core.java.student.arfaz.assignment_11_Inheritance.Employee;

/*	05.	Create a Child class Employee having 2 different methods 'protected void name()' and 'void child()' create 
		3 child classes in same package of Child class and also 3 classes with different packages of Child class.
		Try to override and call from main method where we are going to create object of Child and child class.
		(refrence of Child class and object of child class like we did in our class, Child p = new Child(); )
*/
public class EmployeeSub2 extends Employee {
	@Override
	protected void name() {
		System.out.println("Child");
	}
	
	@Override
	public void child() {
		System.out.println("Child");
	}
	
}
