package org.la.core.java.student.tanseer.assignment9.inheritance.parent;
/*
 * Create a parent class Employee having 2 different methods 'protected void name()' and 
 * 'void child()' create 3 child classes in same package of parent class and also 3 classes 
 * with different packages of parent class.Try to override and call from main method where 
 * we are going to create object of parent and child class.(refrence of parent class and 
 * object of child class like we did in our class, Parent p = new Child(); )		
 */

public class Employee 
{
	protected void name()
	{
		System.out.println("Employee Parent class, name() method");
	}
	
	protected void child()
	{
		System.out.println("Employee Parent class, child() method");
	}
}
