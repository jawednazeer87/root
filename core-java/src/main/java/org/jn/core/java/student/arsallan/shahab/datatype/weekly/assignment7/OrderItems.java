package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class OrderItems {

	int orderId;
	int productId;
	int quantity;

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

	@Override
	public String toString() {
		return "OrderItems [orderId=" + orderId + ", productId=" + productId + ", quantity=" + quantity + "]";
	}
	
	
	
}
