package org.la.core.java.student.tanseer.assignment8.classes;

public class CityMain 
{
	public static void main(String[] args) 
	{
		City city = new City();
		city.setId(1234);
		city.setCity("Bangalore");
		
		System.out.println("Id : "+city.getId());
		System.out.println("City : "+city.getCity());
	}
}
