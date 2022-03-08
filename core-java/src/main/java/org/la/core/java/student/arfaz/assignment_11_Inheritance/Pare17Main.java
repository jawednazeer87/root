package org.la.core.java.student.arfaz.assignment_11_Inheritance;

import org.la.core.java.student.arfaz.assignment_11_Inheritance.subclasse.Pare17Sub;

/*		Create a class having method protected int search(String, char), create a child class which will override this method
		in this method u have to search character in the string if found then return position means location if not found then
		return -1.*/
public class Pare17Main {
	
	public static void main(String[] args) {
	   Pare17 p = new Pare17Sub();
	   char a[]= new char[10];
	   a[0] = 'a';
//	   a[1] = 'r';
//	   a[2] = 'f';
//	   a[3] = 'a';
//	   a[4] = 'z';
	 System.out.println(p.search("arfaz", a));  
	}
	
}
