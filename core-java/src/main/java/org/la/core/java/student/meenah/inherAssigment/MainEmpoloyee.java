package org.la.core.java.student.meenah.inherAssigment;

public class MainEmpoloyee {

	public static void main(String[] args) {
		
		Empoloyee e = new Manger();
		e.name();
		e.child();
		
		e = new Director();
		e.name();
		e.child();
		
		e = new Secretary();
		e.name();
		e.child();
	}

}
