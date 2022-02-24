package org.la.core.java.student.moshin.assignment9;

public class Employeechild1 extends Employee {
	protected void name() {
		System.out.println("Secrectory Emoloyee");
	}
	
	@Override
	public void child() {
		System.out.println("child secratery of Empoloyee");
	}
	public static void main(String[] args) {
		
		Employee e = new Employeechild1();
		e.name();
		e.child();
	}

}
