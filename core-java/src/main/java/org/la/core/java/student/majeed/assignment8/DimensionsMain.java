package org.la.core.java.student.majeed.assignment8;

/*
28.	Create a class Dimensions having member variables id, dimensionValue. create getters and 
	setters for all member variables. Create object of Dimensions class in other class inside main method
	and set all member values and print all member values using getters.
	*/

public class DimensionsMain {
	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions();
		
		dimensions.setId(1);
		dimensions.setDimensionValue(100);
		
		System.out.println(dimensions.getId());
		System.out.println(dimensions.getDimensionValue());
	}
}
