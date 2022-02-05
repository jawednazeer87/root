package org.la.core.java.student.tanseer.assignment8.classes;

import java.util.Date;

public class Vehicle 
{
	int seat;
	String type;
	Date expiry;
	
	public void setter(int s, String ty, Date dt)
	{
		seat = s;
		type = ty;
		expiry = dt;
	}
	
	public void print()
	{
		System.out.println("No of seats  \t"+seat);
		System.out.println("Vehicle type  \t"+type);
		System.out.println("Expiry date  \t"+expiry);
		System.out.println();
	}
}
