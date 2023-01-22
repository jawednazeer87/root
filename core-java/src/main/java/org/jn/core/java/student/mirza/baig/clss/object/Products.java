package org.jn.core.java.student.mirza.baig.clss.object;

import java.util.Date;

public class Products {

	
	private int merchantId;
	private String name;
	private double price;
	private String status;
	private Date createdAt;
	
	
	public void setMerchantId( int merchantId) {
		this.merchantId=merchantId;
	}
	public int getMerchantId() {
		return merchantId;
		
	}
	public void setName(String name) {
		
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	public void setStatus(String status) {
		this.status=status;
	}
	public String getStatus() {
		return status;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt=createdAt;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
}




//Create a class Products having member variables id, merchantId, name, price, status, 
//createdAt. create getters and setters for all member variables. Create object of Products class in other 
//class inside main method and set all member values and print all member values using getters.