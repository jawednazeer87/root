package org.la.core.java.student.arfaz.assignment_11_Inheritance;

import org.la.core.java.student.arfaz.assignment_11_Inheritance.subclasse.Para19Sub;

/*		19.	Create a parent class having protected String reverse(String) method, override reverse method in child class
		reverse method will reverse and return reverse string.
	*/
public class Pare19Main {
	
	public static void main(String[] args) {
	   Pare19 p = new Para19Sub();
	 System.out.println(p.reverse("acche din"));  
	}
	
}
