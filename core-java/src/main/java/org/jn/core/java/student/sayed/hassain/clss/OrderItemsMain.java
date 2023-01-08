package org.jn.core.java.student.sayed.hassain.clss;

public class OrderItemsMain {
	
	public static void main(String[] args) {
		
		OrderItems orderItems=new OrderItems();
		orderItems.setterOrderId(12);
		System.out.println(orderItems.getterOrderId());
		
		orderItems.setterProductId(10202);
		System.out.println(orderItems.getterProductId());
		
		orderItems.setterQuantity(700);
		System.out.println(orderItems.getterQuantity());
	}

}
