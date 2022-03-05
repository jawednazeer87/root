package org.la.core.java.student.majeed.assignment9.school;

/*
 * 	04.	Create  an abstract parent class School having 3 methods,  abstract void numStudents(int),  abstract String address() and void name(String), 
		create 5 child class which will override 3 methods of parent class.
 */

public class Intermediate extends School {
	@Override
	public void numStudents(int i) {
		System.out.println("No of students in Intermediate college are "+i);
	}
	@Override
	public String address() {
		return "India";
	}
	@Override
	public void name(String schoolName) {
		System.out.println("The Intermediate college name is "+schoolName);
	}
}
