package org.la.core.java.student.tanseer.assignment9.inheritance.child;

import org.la.core.java.student.tanseer.assignment9.inheritance.parent.School;

public class SchoolChildOne extends School
{
	@Override
	protected void numStudents(int n) {
		super.numStudents(n);
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
