package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class OrdersMain {

	public static void main(String[] args) {
		
		Orders o = new Orders();
		
		o.setCreatedAt("01-01-0001");
		o.setId(13);
		o.setStatus("cancelled");
		o.setUserId(14);
		
		System.out.println("Orders [id=" + o.getId() + ", userId=" + o.getUserId() + ", status=" + o.getStatus() + ", createdAt=" + o.getCreatedAt() + "]");
	}

}
