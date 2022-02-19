package org.la.core.java.student.meenah.employee;

import org.la.core.java.student.meenah.inherAssigment.Empoloyee;

public class Director extends Empoloyee {
	
	@Override
	protected void name() {
		System.out.println("Director Emoloyee");
	}
	
	@Override
	public void child() {
		System.out.println("Director child");
	}

}
