package org.jn.core.java.student.shoaeeb.absclss;

public class OrdersAbsClassImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrdersAbsClass abs = new OrdersAbsClassImpl();
		abs.setId(1);
		abs.setUserId(5);
		abs.setStatus("online");
		
		System.out.println("Id: "+abs.getId()+" User Id: "+abs.getUserId()+" Status: "+abs.getUserId());
	}

}
