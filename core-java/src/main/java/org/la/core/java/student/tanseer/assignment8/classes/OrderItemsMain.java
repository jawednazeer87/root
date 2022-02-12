package org.la.core.java.student.tanseer.assignment8.classes;

public class OrderItemsMain 
{
	public static void main(String[] args)
	{
		OrderItems od = new OrderItems();
		od.setOrderId(1222);
		od.setProductId(1234);
		od.setQuantity(20);
		od.display();
	}
}
