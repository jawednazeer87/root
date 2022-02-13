package org.la.core.java.student.majeed.assignment8;

/*
8.	Create a class City having member variables id, cityName. create getters and 
	setters for all member variables. Create object of City class in other class inside main method
	and set all member values and print all member values using getters.
 */

public class CityMain {

	public static void main(String[] args) {
		City city = new City();
		
		city.setId(88);
		city.setCityName("Hyderabad");
		
		System.out.println(city.getId());
		System.out.println(city.getCityName());
	}
}
