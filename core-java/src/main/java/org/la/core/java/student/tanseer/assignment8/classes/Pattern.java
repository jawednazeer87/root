package org.la.core.java.student.tanseer.assignment8.classes;
/*
 * Create a class Pattern having member variables id, optionName. create getters and 
	setters for all member variables. Create object of Pattern class in other class inside 
	main method and set all member values and print all member values using getters.
 */
public class Pattern 
{
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
	
	public void display()
	{
		System.out.println("Id : "+id);
		System.out.println("Option Name : "+optionName);
	}
}
