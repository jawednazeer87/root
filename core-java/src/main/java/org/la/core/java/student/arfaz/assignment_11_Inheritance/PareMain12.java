package org.la.core.java.student.arfaz.assignment_11_Inheritance;

/*		12.	Create a Parent class having a method 'static void fun()' create a child class and try to override statice method 
		in child class. create object in main method and observe the behavior.
*/
public class PareMain12 {
	public static void main(String[] args) {
		Pare12 pa = new PareSub12();
		pa.fun();
		pa.display();
		pa.print();
	}
}
