package org.la.core.java.student.meenah.inherAssigment;

public class Director extends Empoloyee{
	
	@Override
	protected void name() {
		System.out.println("Director Empoloyee");
	}
	
	@Override
	public void child() {
		System.out.println("child director of empoloyee");
	}

}
