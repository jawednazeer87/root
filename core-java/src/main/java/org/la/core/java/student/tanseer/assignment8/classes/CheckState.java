package org.la.core.java.student.tanseer.assignment8.classes;

public class CheckState 
{
	private String sName;
	private CheckCity city;
	
	public CheckState(String sName,CheckCity city)
	{
		this.sName = sName;
		this.city = city;
	}
	
	public void setStateName(String sName)
	{
		this.sName = sName;
	}
	
	public String getState()
	{
		return sName;
	}
	
	public void setCityName(CheckCity city)
	{
		this.city = city;
	}
	
	public CheckCity getCity()
	{
		return city;
	}
	
	public void displaySate()
	{
		System.out.println("State Name\t : "+sName);
		city.displayCity();
	}
}
