package org.la.core.java.student.majeed.assignment8;

/*
27.	Create a class Colors having member variables id, colorName. create getters and 
	setters for all member variables. Create object of Colors class in other class inside main method
	and set all member values and print all member values using getters.
	*/

public class Colors {
    private int id; 
    private String colorName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColorName() {
		return colorName;
	}
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
}
