package org.la.core.java.student.arfaz.assignment_11_Inheritance.subclasse;

import org.la.core.java.student.arfaz.assignment_11_Inheritance.Pare13;

/*		Create a Child class having a method 'protected static void fun()' create a child class and try to override statice method 
		in child class. create object in main method and observe the behavior. Create two child classes one in same package
		and one in different packages.
*/
public class PareSub13OtherPack extends Pare13 {
	public PareSub13OtherPack()  {
		
	}
	protected  void print() {
		System.out.println("Child  other package");
	}
	
	public void display() {
		System.out.println("Child  other package");
	}
	protected static void fun() {
		System.out.println("Child Static other package");

	}
}
