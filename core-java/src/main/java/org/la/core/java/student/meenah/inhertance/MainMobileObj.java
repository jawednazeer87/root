package org.la.core.java.student.meenah.inhertance;

public class MainMobileObj {

	public static void main(String[] args) {
		
		Mobile m = new Sumsung();
		m.display(); 
		
		// we cannot call method inside child class -- only method in parent class is accessible
		//m.androide();

	}

}
