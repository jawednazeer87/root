package org.la.core.java.student.arfaz.assignment_11_Inheritance;

import org.la.core.java.student.arfaz.assignment_11_Inheritance.subclasse.Para21Sub;

/*		19.	Create a parent class having protected String reverse(String) method, override reverse method in child class
		reverse method will reverse and return reverse string.
	*/
public class Pare21Main {
	
	public static void main(String[] args) {
	   Pare21 p = new Para21Sub();
	 System.out.println(p.lowercase("ArFaZ"));  
	}
	
}