package org.la.core.java.student.tanseer.assignment8.classes;
/*
 * Create a class Product having member variables id, productName, description, baseRelationTable, 
 * patternId. create getters and setters for all member variables. Create object of Product class in 
 * other class inside main method and set all member values and print all member values using 
 * getters.
 */
public class Product 
{
	private int id;
	private String productName;
	private String description;
	private String baseRelationTable;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBaseRelationTable() {
		return baseRelationTable;
	}
	public void setBaseRelationTable(String baseRelationTable) {
		this.baseRelationTable = baseRelationTable;
	}
	
	public void display()
	{
		System.out.println("ID : "+id);
		System.out.println("Product Name : "+productName);
		System.out.println("Description : "+description);
		System.out.println("Realtion Table : "+baseRelationTable);
	}
}
