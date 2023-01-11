package org.jn.core.java.student.shoaeeb.absclss;

public class OrderItemsAbsClassImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderItemsAbsClass abs = new OrderItemsAbsClassImpl();
		abs.setOrderId(1);
		abs.setProductId(5);
		abs.setQuantity(6);
		
		System.out.println("Order Id: "+abs.getOrderId()+" Product Id: "+abs.getProductId()+" Quantity: "+abs.getQuantity());
	}

}
