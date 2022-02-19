package org.la.core.java.student.majeed.assignment8;

/*
27.	Create a class Colors having member variables id, colorName. create getters and 
	setters for all member variables. Create object of Colors class in other class inside main method
	and set all member values and print all member values using getters.
	*/

public class ColorsMain {
	public static void main(String[] args) {
		Colors colors = new Colors();
		
		colors.setId(1);
		colors.setColorName("Green");
		
		System.out.println(colors.getId());
		System.out.println(colors.getColorName());
		
	}
	
	
	
}
