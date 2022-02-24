package org.la.core.java.student.moshin.assignment9;

public class Employeechild2 extends Employeechild1 {
	protected void name() {
		System.out.println("Director Emoloyee");
	}
	
	@Override
	public void child() {
		System.out.println("child Director of Empoloyee");
	}
	public static void main(String[] args) {
		
		Employee e = new Employeechild2();
		e.name();
		e.child();
	}

}
