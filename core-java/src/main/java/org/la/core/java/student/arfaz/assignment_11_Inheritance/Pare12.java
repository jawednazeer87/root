package org.la.core.java.student.arfaz.assignment_11_Inheritance;

/*		12.	Create a Parent class having a method 'static void fun()' create a child class and try to override statice method 
		in child class. create object in main method and observe the behavior.
*/
public class Pare12 {
	public Pare12()  {
		
	}
	protected void print() {
		System.out.println("Parent");
	}
	
	public void display() {
		System.out.println("Parent");
	}
	static void fun() {
		System.out.println("Parent Static");

	}
}
