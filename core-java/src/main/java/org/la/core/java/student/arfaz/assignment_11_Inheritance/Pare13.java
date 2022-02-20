package org.la.core.java.student.arfaz.assignment_11_Inheritance;

/*		Create a Parent class having a method 'protected static void fun()' create a child class and try to override statice method 
		in child class. create object in main method and observe the behavior. Create two child classes one in same package
		and one in different packages.
*/
public class Pare13 {
	public Pare13()  {
		
	}
	protected  void print() {
		System.out.println("Parent");
	}
	
	public void display() {
		System.out.println("Parent");
	}
	protected static void fun() {
		System.out.println("Parent Static");

	}
}
