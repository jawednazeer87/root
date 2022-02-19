package org.la.core.java.student.majeed.assignment8;

/*
26.	Create a class OptionValues having member variables id, optionId, valueName. 
create getters and setters for all member variables. Create object of OptionValues class 
in other class inside main method and set all member values and print all member values using getters.
*/

public class OptionValues {
    private int id; 
    private int optionId;
    private String valueName;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOptionId() {
		return optionId;
	}
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}
	public String getValueName() {
		return valueName;
	}
	public void setValueName(String valueName) {
		this.valueName = valueName;
	}
    
}
