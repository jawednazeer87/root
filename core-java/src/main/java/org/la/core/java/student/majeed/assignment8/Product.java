package org.la.core.java.student.majeed.assignment8;

/*
21.	Create a class Product having member variables id, productName, description, baseRelationTable, patternId. 
create getters and setters for all member variables. Create object of Product class in other class inside main 
method and set all member values and print all member values using getters.
*/

public class Product {
	
    private int id; 
    private int patternId;
    private String productName;
    private String description;
    private String baseRelationTable;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPatternId() {
		return patternId;
	}
	public void setPatternId(int patternId) {
		this.patternId = patternId;
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
}
