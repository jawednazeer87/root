package org.jn.core.java.student.shoaeeb.clss;

public class OrdersItems {
	private int orderId;
	private int productId;
	private int quantity;
	
	public void setOrderId(int orderId)
	{
		this.orderId=orderId;
	}
	public void setProductId(int productId)
	{
		this.productId=productId;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	//getters
	public int getOrderId() {
		return orderId;
	}
	public int getProductId() {
		return productId;
	}
	public int getQuantity() {
		return quantity;
	}
}
