package org.la.core.java.student.majeed.assignment8;

/*
11.	Create a class Orders having member variables id, userId, status, createdAt. create getters and 
	setters for all member variables. Create object of Orders class in other class inside main method
	and set all member values and print all member values using getters.
 */

public class OrdersMain {
	
	public static void main(String[] args) {
		Orders orders = new Orders();
		
		orders.setId(1);
		orders.setUserId(101);
		orders.setStatus("In Progress");
		orders.setCreatedAt("India");
		
		System.out.println(orders.getId());
		System.out.println(orders.getUserId());
		System.out.println(orders.getStatus());
		System.out.println(orders.getCreatedAt());
	}
		
}
