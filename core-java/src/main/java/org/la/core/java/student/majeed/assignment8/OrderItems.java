package org.la.core.java.student.majeed.assignment8;

/*
10.	Create a class OrderItems having member variables orderId, productId, quantity. create getters and 
	setters for all member variables. Create object of OrderItems class in other class inside main method 
	and set all member values and print all member values using getters.
 */

public class OrderItems {
	private int orderId;
	private int productId; 
	private int quantity;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
