package org.la.core.java.student.majeed.assignment8;


/*
20.	Create a class Pattern having member variables id, optionName. create getters and 
	setters for all member variables. Create object of Pattern class in other class inside main method
	and set all member values and print all member values using getters.
	 */

public class PatternMain {  
	
	public static void main(String[] args) {
    Pattern pattern = new Pattern();
    pattern.setId(10);
    pattern.setOptionName("star");

    System.out.println("Id = " + pattern.getId());
    System.out.println("OptionName = " + pattern.getOptionName());
}
}