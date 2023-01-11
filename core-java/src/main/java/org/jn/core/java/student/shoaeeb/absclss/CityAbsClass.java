package org.jn.core.java.student.shoaeeb.absclss;

public abstract class CityAbsClass {
	int id;
	String city;
	
	//setters
	public abstract void setId(int id);
	public abstract void setCity(String city);
	
	//getters
	public int getId() {
		return this.id;
	}
	public String getCity() {
		return this.city;
	}
	
}
