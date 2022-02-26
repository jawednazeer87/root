package org.la.core.java.student.tanseer.assignment9.inheritance.child;

import org.la.core.java.student.tanseer.assignment9.inheritance.parent.Planet;

public class PlanetChildTwo extends Planet
{
	@Override
	protected void name() 
	{
		System.out.println("Child 2 of planet class");
	}
	
	@Override
	protected void distance(int dis) 
	{
		this.dis = 1000; // this line doesn't have any impact on code
		System.out.println(dis);	
	}
}
