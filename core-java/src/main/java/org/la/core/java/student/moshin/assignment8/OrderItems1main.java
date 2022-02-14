package org.la.core.java.student.moshin.assignment8;

public class OrderItems1main {
	
	public static void main(String[] args) {
		OrderItems1 OrderItem = new OrderItems1();
		
		OrderItem.setOrderId(15);
		OrderItem.setProductId("548");
		OrderItem.setQuantity("54");
		
		System.out.println("Order ID: "+OrderItem.getOrderId());
		System.out.println("Product ID: "+OrderItem.getProductId());
		System.out.println("Quantity: "+OrderItem.getQuantity());	
	
	}
	
	
	
}
