package org.la.core.java.student.arfaz.assignment_11_Inheritance;

import org.la.core.java.student.arfaz.assignment_11_Inheritance.subclasse.EmployeeSub;

/*	05.	Create a parent class Employee having 2 different methods 'protected void name()' and 'void child()' create 
		3 child classes in same package of parent class and also 3 classes with different packages of parent class.
		Try to override and call from main method where we are going to create object of parent and child class.
		(refrence of parent class and object of child class like we did in our class, Parent p = new Child(); )
*/
public class EmployeeMain {
	public static void main(String[] args) {
		Employee e = new EmployeeSub();
		e.child();
		e.name();
		 e = new EmployeeSub1();
		 e.child();
		 e.name();
		 e = new EmployeeSub2();
		 e.child();
		 e.name();
		 e = new EmployeeSub3();
		 e.child();
		 e.name();
		
	}
}
