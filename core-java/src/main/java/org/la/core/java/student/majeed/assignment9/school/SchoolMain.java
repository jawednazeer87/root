package org.la.core.java.student.majeed.assignment9.school;

/*
 * 	04.	Create  an abstract parent class School having 3 methods,  abstract void numStudents(int),  abstract String address() and void name(String), 
		create 5 child class which will override 3 methods of parent class.
 */

public class SchoolMain {
	public static void main(String[] args) {
		School elementarySchool = new Elementary();
		elementarySchool.numStudents(200);
		System.out.println("Address is "+elementarySchool.address());
		elementarySchool.name("Indian Elementary School");
		System.out.println();
		
		School secondarySchool = new Secondary();
		secondarySchool.numStudents(500);
		System.out.println("Address is "+secondarySchool.address());
		secondarySchool.name("Indian Secondary School");
		System.out.println();
		
		School highSchool = new High();
		highSchool.numStudents(600);
		System.out.println("Address is "+highSchool.address());
		highSchool.name("Indian High School");
		System.out.println();
		
		School intermediateCollege = new Intermediate();
		intermediateCollege.numStudents(800);
		System.out.println("Address is "+intermediateCollege.address());
		intermediateCollege.name("Indian Intermediate College");
		System.out.println();
		
		School university = new University();
		university.numStudents(2000);
		System.out.println("Address is "+university.address());
		university.name("Indian university");	
	}
}
