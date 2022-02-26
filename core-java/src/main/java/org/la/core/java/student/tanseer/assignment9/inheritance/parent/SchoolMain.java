package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

import org.la.core.java.student.tanseer.assignment9.inheritance.child.SchoolChildOne;
import org.la.core.java.student.tanseer.assignment9.inheritance.child.SchoolChildTwo;

public class SchoolMain 
{
	public static void main(String[] args) 
	{
		School sc = new SchoolChildOne();
		sc.numStudents(50);
		System.out.println(sc.address());
		sc.name("Ahmed");
		
		System.out.println();
		
		sc = new SchoolChildTwo();
		sc.numStudents(120);
		System.out.println(sc.address());
		sc.name("Zakir");
	}	
	
}
