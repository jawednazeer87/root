package org.la.core.java.student.arfaz.assignment_11_Inheritance;

import org.la.core.java.student.arfaz.assignment_11_Inheritance.subclasse.PrRSub1;
import org.la.core.java.student.arfaz.assignment_11_Inheritance.subclasse.PrRSub_2;

/*	08.	Create a parent class having 2 methods,  protected void print(), void display(), create 3 child classes 
		in same package as well as in different packages and try to call from main method. 
*/
public class PrRMain {
	public static void main(String[] args) {
		PrR pr = new PrRSub1();
		pr.print();
		pr.display();
		 pr = new PrRSub_2();
		 pr.display();
		 pr.print();

	}
}
