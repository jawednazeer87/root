package org.jn.core.java.student.mirza.baig.clss.object;

public class OrderItemsMain {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrderItems o = new OrderItems ();
		
		o.setOrderId(102);
		o.setProductId("PU110084NE");
		o.setQuantity(100);

		
		System.out.println("Order id    :"+o.getOrderId());
		System.out.println("Product Id  :"+o.getproductId());
		System.out.println("Quantity    :"+o.getQuantity());
	}

}
