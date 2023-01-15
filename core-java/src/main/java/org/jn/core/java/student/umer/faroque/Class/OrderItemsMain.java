package org.jn.core.java.student.umer.faroque.Class;

public class OrderItemsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrdersItems ord= new OrdersItems();
		ord.setOrderId(1);
		ord.setProductId(6);
		ord.setQuantity(100);
		
		System.out.println("Id: "+ord.getOrderId()+" Product Id: "+ord.getProductId()+" Quantity: "+ord.getQuantity());
	}

}
