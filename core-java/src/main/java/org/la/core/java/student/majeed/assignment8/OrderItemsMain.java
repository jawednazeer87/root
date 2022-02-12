package org.la.core.java.student.majeed.assignment8;

/*
10.	Create a class OrderItems having member variables orderId, productId, quantity. create getters and 
	setters for all member variables. Create object of OrderItems class in other class inside main method 
	and set all member values and print all member values using getters.
 */

public class OrderItemsMain {
	
	public static void main(String[] args) {
		OrderItems orderItems = new OrderItems();
		
		orderItems.setOrderId(1);
		orderItems.setProductId(10);
		orderItems.setQuantity(100);
		
		System.out.println(orderItems.getOrderId());
		System.out.println(orderItems.getProductId());
		System.out.println(orderItems.getQuantity());		
	}
	
}
