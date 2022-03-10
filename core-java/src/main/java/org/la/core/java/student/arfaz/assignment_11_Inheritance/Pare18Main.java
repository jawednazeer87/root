package org.la.core.java.student.arfaz.assignment_11_Inheritance;

import org.la.core.java.student.arfaz.assignment_11_Inheritance.subclasse.Para18Sub;

/*		Create a parent class having public String remove(String, char) method, create a child class which will override remove 
		method. remove method will remove char from the string and will return new string.
		*/
public class Pare18Main {
	
	public static void main(String[] args) {
	   Pare18 p = new Para18Sub();
	   char  a = 'a';
	  
//	   a[1] = 'r';
//	   a[2] = 'f';
//	   a[3] = 'a';
//	   a[4] = 'z';
	 System.out.println(p.remove("arfaz", a));  
	}
	
}
