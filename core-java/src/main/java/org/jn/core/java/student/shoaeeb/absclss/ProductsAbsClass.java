package org.jn.core.java.student.shoaeeb.absclss;

public abstract class ProductsAbsClass {
	int id;
	int merchantId;
	String name;
	float price;
	String status;
	
	
	//setters
	public abstract void setId(int id);
	public abstract void setMerchantId(int merchantId);
	public abstract void setName(String name);
	public abstract void setPrice(float price);
	public abstract void setStatus(String status);
	
	//getters
	public abstract int getId();
	public abstract int getMerchantId();
	public abstract String getName();
	public abstract float getPrice();
	public abstract String getStatus();
	
	
}
