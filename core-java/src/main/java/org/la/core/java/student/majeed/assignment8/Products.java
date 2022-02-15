package org.la.core.java.student.majeed.assignment8;

/*
14.	Create a class Products having member variables id, merchantId, name, price, status, createdAt. 
create getters and setters for all member variables. Create object of Products class in other class 
inside main method and set all member values and print all member values using getters.
 */

public class Products {
    private int id;
    private int merchantId;
    private int price;
    private String status;
    private String name;
    private String createdAt;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
    		
}
