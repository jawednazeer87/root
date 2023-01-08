package org.jn.core.java.student.sayed.hassain.clss;

public class OrdersMain {
	
	public static void main(String[] args) {
		
		Orders orders=new Orders();
		orders.setterId(12);
		System.out.println(orders.getterId());
		
		orders.setterUserId("Abhay404");
		System.out.println(orders.getterUserId());
		
		orders.setterStatus("Pending");
		System.out.println(orders.getterStatus());
		
		orders.setterCreatedAt("12th Jan");
		System.out.println(orders.getterCreatedAt());
	}

}
