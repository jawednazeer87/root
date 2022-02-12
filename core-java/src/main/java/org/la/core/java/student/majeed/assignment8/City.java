package org.la.core.java.student.majeed.assignment8;

/*
8.	Create a class City having member variables id, cityName. create getters and 
	setters for all member variables. Create object of City class in other class inside main method
	and set all member values and print all member values using getters.
 */

public class City {
	private int id;
	private String cityName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}	
}
