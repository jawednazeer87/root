package org.jn.core.java.student.shoaeeb.enumerations;

public enum Planets {

	MERCURY(57910,3.30e12),VENUS(108200,4.87e12),EARTH(149600,5.98e12);
	
	private double distance;
	private double mass;
	Planets(double distance,double mass)
	{
		this.distance=distance;
		this.mass=mass;
	}
	double getDistance()
	{
		return distance;
	}
	double getMass() {
		return mass;
	}
	static void  getName(String choice)
	{
		if(choice.equals("MERCURY"))
		{
			System.out.println("Planet Mercury");
		}
		else if(choice.equals("VENUS"))
		{
			System.out.println("Planet Venus");
		}
		else if(choice.equals("EARTH")) {
			System.out.println("Planet Earth");
		}
	}
}
