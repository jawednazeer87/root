package org.la.core.java.student.tanseer.assignment8.main.classes;

import java.util.Date;

import org.la.core.java.student.tanseer.assignment8.classes.Vehicle;

public class VehicleMain 
{
	public static void main(String[] args) 
	{
		Vehicle v1 = new Vehicle();
		v1.setter(5, "Hatch Back", new Date());
		v1.print();
		
		Vehicle v2 = new Vehicle();
		v2.setter(7, "MUV", new Date());
		v2.print();
	}
}
