package org.la.core.java.student.tanseer.assignment8.classes;

/*
 * Create a class Company having member variables companyId, name, description. create getters and 
	setters for all member variables. Create object of Company class in other class inside main method
	and set all member values and print all member values using getters.
 */
public class Company 
{
	private int companyId;
	private String name;
	private String description;
	
	public void setId(int companyId)
	{
		this.companyId = companyId;
	}
	
	public int getId()
	{
		return this.companyId;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public void display()
	{
		System.out.println("CompanyId \t:"+companyId);
		System.out.println("Name \t\t:"+name);
		System.out.println("Description \t:"+description);
		System.out.println();
	}
}
