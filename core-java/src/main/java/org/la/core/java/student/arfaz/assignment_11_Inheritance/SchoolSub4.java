package org.la.core.java.student.arfaz.assignment_11_Inheritance;

/*04.	Create a parent class School having 3 methods, void numStudents(int), String address() and void name(String), 
create 5 child class which will override 3 methods of parent class.*/
public class SchoolSub4 extends School{
	void numStudents(int i) {
		System.out.println("Parent");
	}
	String address() {
		System.out.println("Parent");
		return"";
	}
	
	void name() {
		System.out.println("Parent");
	}
	
}
