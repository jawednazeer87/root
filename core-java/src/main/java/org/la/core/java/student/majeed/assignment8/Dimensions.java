package org.la.core.java.student.majeed.assignment8;

/*
28.	Create a class Dimensions having member variables id, dimensionValue. create getters and 
	setters for all member variables. Create object of Dimensions class in other class inside main method
	and set all member values and print all member values using getters.
	*/

public class Dimensions {
    private int id; 
    private int dimensionValue;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDimensionValue() {
		return dimensionValue;
	}
	public void setDimensionValue(int dimensionValue) {
		this.dimensionValue = dimensionValue;
	}
}
