package org.jn.core.java.student.sadullah.objects;

public class Student {
	String name;
	int rollNo;
	int standard;
	int age;
	
	public void setter (String nme, int roll, int stndrd, int ag) {
		name = nme;
		rollNo = roll;
		standard = stndrd;
		age = ag;
	}
	
	public void print() {
		System.out.println("Student name: " +name);
		System.out.println("Student roll no: " +rollNo);
		System.out.println("Student standard: " +standard);
		System.out.println("Student age: " +age);
	}
}