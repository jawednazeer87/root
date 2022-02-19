package org.la.core.java.student.meenah.employee;

import org.la.core.java.student.meenah.inherAssigment.Empoloyee;

public class Secretary extends Empoloyee {
	@Override
	protected void name() {
		System.out.println("Secratray Emoloyee");
	}
	
	@Override
	public void child() {
		System.out.println("Employee 2");
	}

}
