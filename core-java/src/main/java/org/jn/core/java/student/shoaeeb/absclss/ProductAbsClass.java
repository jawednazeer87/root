package org.jn.core.java.student.shoaeeb.absclss;

public abstract class ProductAbsClass {
	int id;
	String productName;
	String description;
	
	public abstract void setId(int id);
	public abstract void setProductName(String productName);
	public abstract void setDescription(String description);
	
	//getters
	public abstract int getId();
	public abstract String getProductName();
	public abstract String getDescription();
}
