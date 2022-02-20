package org.la.core.java.student.arfaz.assignment_11_Inheritance;

import org.la.core.java.student.arfaz.assignment_11_Inheritance.subclasse.PareSub13OtherPack;

/*		Create a Parent class having a method 'protected static void fun()' create a child class and try to override statice method 
		in child class. create object in main method and observe the behavior. Create two child classes one in same package
		and one in different packages.
*/
public class Pare13Main {
	public static void main(String[] args) {
		Pare13 pa = new PareSub13OtherPack();
		pa.fun();
		pa.display();
		pa.print();
	}
}
