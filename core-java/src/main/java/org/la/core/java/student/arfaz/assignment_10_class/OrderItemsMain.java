package org.la.core.java.student.arfaz.assignment_10_class;

public class OrderItemsMain {

	public static void main(String[] args) {
		OrderItems pob =  new OrderItems();
//		orderId, productId, quantity
		pob.setOrderId(1);
		pob.setProductId(100);
		pob.setQuantity(1.2f);
		
		System.out.println(pob.getOrderId());
		System.out.println(pob.getProductId());
		System.out.println(pob.getQuantity());
		
	}

}
