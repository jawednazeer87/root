package org.jn.core.java.student.shoaeeb.absclss;

public abstract class CountriesAbsClass {
	int code;
	String name;
	String continentName;
	
	//setters
	public abstract void setCode(int id);
	public abstract void setName(String name);
	public abstract void setContinentName(String continentName);
	
	//getters
	public abstract int getCode();
	public abstract String getName();
	public abstract String getContinentName();
}
