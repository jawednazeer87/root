package org.la.core.java.student.tanseer.assignment8.classes;

public class OrdersMain 
{
	public static void main(String[] args) 
	{
		Orders orders = new Orders();
		orders.setId(12);
		orders.setUserId(123);
		orders.setStatus("Shipping");
		orders.setCreatedAt("India");
		orders.print();
	}
}
