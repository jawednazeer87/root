package org.la.core.java.student.arfaz.assignment_11_Inheritance;

/*		Create a Child class having a method 'protected static void fun()' create a child class and try to override statice method 
		in child class. create object in main method and observe the behavior. Create two child classes one in same package
		and one in different packages.
*/
public class PareSub13 {
	public PareSub13()  {
		
	}
	protected  void print() {
		System.out.println("Child");
	}
	
	public void display() {
		System.out.println("Child");
	}
	protected static void fun() {
		System.out.println("Child Static");

	}
}
