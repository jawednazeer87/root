package org.jn.core.java.student.shoaeeb.absclss;

public abstract class OrderItemsAbsClass {
	int orderId;
	int productId;
	int quantity;
	
	//setters
	public abstract void setOrderId(int orderId);
	public abstract void setProductId(int productId);
	public abstract void setQuantity(int quantity);
	
	//getters
	public abstract int getOrderId();
	public abstract int getQuantity();
	public abstract int getProductId();
	
}
