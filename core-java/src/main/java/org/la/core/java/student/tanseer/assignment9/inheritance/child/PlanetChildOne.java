package org.la.core.java.student.tanseer.assignment9.inheritance.child;

import org.la.core.java.student.tanseer.assignment9.inheritance.parent.Planet;

public class PlanetChildOne extends Planet
{
	@Override
	protected void name() 
	{
		System.out.println("\"Child 1 of Planet \" Earth planet ");
	}
	
//	@Override
//	protected void distance(int dis)
//	{
//		System.out.println(dis);
//	}
	
	@Override
	protected void distance(int dis) {
		super.distance(dis);
	}
}
