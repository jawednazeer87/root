package org.la.core.java.student.meenah.abstra;

public class MainSchool {

	public static void main(String[] args) {
		
		
		School school = new PrimarySchool();
		
		int studentnumber = school.numStudents(10);
		String name = school.name("Ahmed");
		
		System.out.println("stdent numer: " +studentnumber);
		System.out.println(school.address());
		System.out.println(school.name("student name: " +name));
		
		System.out.println();
		
		
		School school1 = new ArabicSchool();
		int studentnum = school1.numStudents(11);
		String studentName = school1.name("Mohamed");
		
		System.out.println("student number: " +studentnum);
		System.out.println(school1.address());
		System.out.println(school1.name("student name: "+studentName));

	}

}
