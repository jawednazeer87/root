package org.la.core.java.student.tanseer.assignment8.classes;

public class CheckCountry 
{
	private String countryName;
	private CheckState state;
	
	public void setCountryName(String countryName)
	{
		this.countryName = countryName;
	}
	
	public void setState(CheckState state)
	{
		this.state = state;
	}
	
	public String getcountryName(String countryName)
	{
		return countryName;
	}
	public CheckState getState()
	{
		return state;
	}
	
	public void displayCountry()
	{
		System.out.println("Country Name\t : "+countryName);
		state.displaySate();
	}
}
