package org.la.core.java.student.meenah.inherAssigment;

public class Secretary  extends Empoloyee{

	@Override
	protected void name() {
		System.out.println("Secrectory Emoloyee");
	}
	
	@Override
	public void child() {
		System.out.println("child secratery of Empoloyee");
	}
}
