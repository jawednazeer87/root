package org.la.core.java.student.meenah.inherAssigment;

public class Manger extends Empoloyee{
	
	@Override
	protected void name() {
		System.out.println("Manger Empoloyee");
	}
	
	@Override
	public void child() {
		System.out.println("child manger of empoloyee");
	}

}
