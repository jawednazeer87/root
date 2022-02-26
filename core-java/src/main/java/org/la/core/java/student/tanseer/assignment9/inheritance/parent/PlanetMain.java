package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

import org.la.core.java.student.tanseer.assignment9.inheritance.child.PlanetChildOne;
import org.la.core.java.student.tanseer.assignment9.inheritance.child.PlanetChildTwo;

public class PlanetMain 
{
	public static void main(String[] args) 
	{
		Planet p1 = new PlanetChildOne();
		p1.name();
		p1.distance(121000);
		
		p1 = new PlanetChildTwo();
		p1.name();
		p1.distance(1234);
	}
}