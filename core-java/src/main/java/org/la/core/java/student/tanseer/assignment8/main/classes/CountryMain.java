package org.la.core.java.student.tanseer.assignment8.main.classes;

import org.la.core.java.student.tanseer.assignment8.classes.CheckCity;
import org.la.core.java.student.tanseer.assignment8.classes.CheckCountry;
import org.la.core.java.student.tanseer.assignment8.classes.CheckState;

public class CountryMain 
{
	public static void main(String[] args) 
	{
		CheckCity city = new CheckCity("Bangalore",560051);
		CheckState state = new CheckState("Karnataka",city);
		CheckCountry country = new CheckCountry();
		country.setCountryName("India");
		country.setContinent("Asia");
		country.setState(state);
		country.displayCountry();
	}
}
