package org.la.core.java.student.arfaz.assignment_10_class;

public class OrderMain {

	public static void main(String[] args) {
		Order pob =  new Order();
//		id, userId, status, createdAt
		pob.setId(1);
		pob.setUserId(100);
		pob.setStatus("Arrived");
		
		System.out.println(pob.getId());
		System.out.println(pob.getUserId());
		System.out.println(pob.getStatus());
		
	}

}
