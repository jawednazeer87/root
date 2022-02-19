package org.la.core.java.student.meenah.inherAssigment;

public class MainPlanet {

	public static void main(String[] args) {
		
		Planet p = new  Sun();
		p.name();
		p.distance(1000);
		
		p = new Moon();
		p.name();
		p.distance(2000);
	}

}
