package org.la.core.java.student.majeed.assignment9.school;

/*
 * 	04.	Create  an abstract parent class School having 3 methods,  abstract void numStudents(int),  abstract String address() and void name(String), 
		create 5 child class which will override 3 methods of parent class.
 */

public abstract class School {
	abstract void numStudents(int i);
	abstract String address();
	void name(String schoolName) {
		System.out.println("The parent school name is "+schoolName);
	}
}
