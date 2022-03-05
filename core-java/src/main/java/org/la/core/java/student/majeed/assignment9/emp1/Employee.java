package org.la.core.java.student.majeed.assignment9.emp1;

/*
 * 	05.	Create  an abstract parent class Employee having 2 different methods 'protected void name()' and ' abstract void child()' 
 * create 3 child classes in same package of parent class and also 3 classes with different packages of parent class.
	Try to override and call from main method where we are going to create object of parent and child class.
	(Reference of parent class and object of child class like we did in our class, Parent p = new Child(); )
 */

public abstract class Employee {
	protected void name() {
		System.out.println("Employee name method called");
	}
	abstract void child();

}
