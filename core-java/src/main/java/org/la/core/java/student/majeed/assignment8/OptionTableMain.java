package org.la.core.java.student.majeed.assignment8;

/*
25.	Create a class OptionTable having member variables id, optionName. create getters and setters for all member variables. 
Create object of OptionTable class in other class inside main method and set all member values and print all member values using getters.
*/

public class OptionTableMain {
	public static void main(String[] args) {
		OptionTable optionTable = new OptionTable();
		
		optionTable.setId(1);
		optionTable.setOptionName("Success");

		System.out.println("Id: "+optionTable.getId());
		System.out.println("Option Name: "+optionTable.getOptionName());
		
	}
}
