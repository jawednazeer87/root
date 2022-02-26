package org.la.core.java.student.tanseer.assignment9.inheritance.parent;
/*
 * 03.	Create a parent class Planet having void name() and void distance(int) methods, 
 * create 2 child class which will override both methods of parent class.
 */
public class Planet 
{
	public int dis;
	
	protected void name()
	{
		System.out.println("\"Parent class\" Mercury planet ");
	}
	
	protected void distance(int dis)
	{
		this.dis = dis;
		System.out.println(dis);
	}
}
