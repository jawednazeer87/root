package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class OrderItemsMain {

	public static void main(String[] args) {
		
		OrderItems o = new OrderItems();
		
		o.setOrderId(120);
		o.setProductId(121);
		o.setProductId(122);
		
		System.out.println("OrderItems [orderId=" + o.getOrderId() + ", productId=" + o.getProductId() + ", quantity=" + o.getQuantity() + "]");
	}

}
