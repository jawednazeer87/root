package org.la.core.java.student.tanseer.assignment9.inheritance.child;

import org.la.core.java.student.tanseer.assignment9.inheritance.parent.School;

public class SchoolChildTwo extends School
{
	@Override
	protected void numStudents(int n) {
		System.out.println("Child class 2 Number of students :"+n);
	}
	@Override
	public String address() {
		return super.address();
	}
	@Override
	protected void name(String name) {
		super.name(name);
	}
	
}
