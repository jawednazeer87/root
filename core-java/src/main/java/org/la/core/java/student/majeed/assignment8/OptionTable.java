package org.la.core.java.student.majeed.assignment8;

/*
25.	Create a class OptionTable having member variables id, optionName. create getters and setters for all member variables. 
Create object of OptionTable class in other class inside main method and set all member values and print all member values using getters.
*/

public class OptionTable {
    private int id; 
    private String optionName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOptionName() {
		return optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
}
