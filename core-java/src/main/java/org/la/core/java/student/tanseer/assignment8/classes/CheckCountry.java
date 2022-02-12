package org.la.core.java.student.tanseer.assignment8.classes;

public class CheckCountry 
{
	private String countryName;
	private String continent;
	private CheckState state;
	
	public void setCountryName(String countryName)
	{
		this.countryName = countryName;
	}
	
	public void setContinent(String continent)
	{
		this.continent = continent;
	}
	
	public String getContinent()
	{
		return continent;
	}
	
	public String getcountryName(String countryName)
	{
		return countryName;
	}
	
	public void setState(CheckState state)
	{
		this.state = state;
	}
	
	public CheckState getState()
	{
		return state;
	}
	
	public void displayCountry()
	{
		System.out.println("Country Name\t : "+countryName);
		System.out.println("Continent \t : "+continent);
		state.displaySate();
	}
}
