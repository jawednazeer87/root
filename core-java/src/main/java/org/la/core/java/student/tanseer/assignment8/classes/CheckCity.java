package org.la.core.java.student.tanseer.assignment8.classes;

public class CheckCity 
{
	private String cName;
	private int pin;
	
	public CheckCity()
	{
		cName = " ";
		pin = 10000;
		System.out.println("Default City and Pin");
	}
	public void setCityName(String cName)
	{
		this.cName = cName;
	}
	
	public void setCityPin(int pin)
	{
		this.pin = pin;
	}
	
	public String getCity()
	{
		return cName;
	}
	
	public int getPin()
	{
		return pin;
	}
	public void displayCity()
	{
		System.out.println("City Name\t : "+cName);
		System.out.println("City Pincode\t : "+pin);
	}
	
}
