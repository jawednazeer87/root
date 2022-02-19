package org.la.core.java.student.majeed.assignment8;

/*
26.	Create a class OptionValues having member variables id, optionId, valueName. 
create getters and setters for all member variables. Create object of OptionValues class 
in other class inside main method and set all member values and print all member values using getters.
*/

public class OptionValuesMain {
	public static void main(String[] args) {
		OptionValues optionValues = new OptionValues();
		
		optionValues.setId(1);
		optionValues.setOptionId(101);
		optionValues.setValueName("Good");
		
		System.out.println(optionValues.getId());
		System.out.println(optionValues.getOptionId());
		System.out.println(optionValues.getValueName());
		
	}
}
