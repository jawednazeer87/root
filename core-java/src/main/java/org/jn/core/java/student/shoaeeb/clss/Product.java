package org.jn.core.java.student.shoaeeb.clss;

public class Product {
	private int id;
	private String productName;
	private String description;
	private String baseRelationTable;
	private int patternId;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String productName)
	{
		this.productName=productName;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
	public void setBaseRelationTable(String baseRelationTable)
	{
		this.baseRelationTable=baseRelationTable;
	}
	public void setPatternId(int patternId)
	{
		this.patternId=patternId;
	}
	
	
	//getters
	public int getId() {
		return id;
	}
	public String getProductName() {
		return productName;
	}
	public String getDescription() {
		return description;
	}
	public String getBaseRelationTable() {
		return baseRelationTable;
	}
	public int getPatternId() {
		return patternId;
	}
	
	
}
