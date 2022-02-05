package org.la.core.java.student.tanseer.assignment8.main.classes;

import org.la.core.java.student.tanseer.assignment8.classes.CheckCity;
import org.la.core.java.student.tanseer.assignment8.classes.CheckCountry;

public class CountryMain 
{
	public static void main(String[] args) 
	{
		CheckCity city = new CheckCity();
		CheckCountry country = new CheckCountry();
		
		city.setCityName("Bangalore");
		city.setCityPin(560051);
		
		country.setCountryName("India");
		
		country.displayCountry();
	}
}
