package org.la.core.java.student.moshin.assignment9;

public class Employeechild3 extends Employeechild2{
	protected void name() {
		System.out.println("Manager Emoloyee");
	}
	
	@Override
	public void child() {
		System.out.println("child Manager of Empoloyee");
	}
	public static void main(String[] args) {
		
		Employee e = new Employeechild3();
		e.name();
		e.child();
		Employee d = new Employee();
		d.name();
		d.child();
	
	}

}
