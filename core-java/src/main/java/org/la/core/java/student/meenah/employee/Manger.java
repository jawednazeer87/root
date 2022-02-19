package org.la.core.java.student.meenah.employee;

import org.la.core.java.student.meenah.inherAssigment.Empoloyee;

public class Manger extends Empoloyee {
	
	@Override
	protected void name() {
		System.out.println("Manger Emoloyee");
	}
	
	@Override
	public void child() {
		System.out.println("One");
	}

}
