package org.la.core.java.student.meenah.abstra;

public class MainPlanet {

	public static void main(String[] args) {
		
		
		Planet p1 = new Sun();
		p1.name();
		int distance = p1.distance(1000);
		System.out.println("distance of sun: "+distance);
		
		Planet p2 = new Moon();
		p2.name();
		int disttance = p2.distance(2000);
		System.out.println("ditance of moon: "+disttance);
		

	}

}
