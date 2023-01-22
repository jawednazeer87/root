package org.jn.core.java.student.mirza.baig.clss.object;


import java.util.Date;

public class OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order o1 = new Order ();
		Date date = new Date();
		
		o1.setUserId(10021);
		o1.setCreatedAt(date);
		o1.setStatus("pending");
		
		System.out.println("user Id   :"+o1.getUserId());
		System.out.println("created At: "+o1.getCreatedAt());
		System.out.println("Status    :"+o1.getStatus());

		
		


	}

}
