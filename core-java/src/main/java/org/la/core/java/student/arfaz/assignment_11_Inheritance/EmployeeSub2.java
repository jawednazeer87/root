package org.la.core.java.student.arfaz.assignment_11_Inheritance;

/*	05.	Create a parent class Employee having 2 different methods 'protected void name()' and 'void child()' create 
		3 child classes in same package of parent class and also 3 classes with different packages of parent class.
		Try to override and call from main method where we are going to create object of parent and child class.
		(refrence of parent class and object of child class like we did in our class, Parent p = new Child(); )
*/
public class EmployeeSub2 extends Employee {
	@Override
	protected void name() {
		System.out.println("Parent");
	}
	
	@Override
	public void child() {
		System.out.println("Parent");
	}
	
}
