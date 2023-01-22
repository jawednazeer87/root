package org.jn.core.java.student.mirza.baig.clss.object;

import java.util.Date;

public class Order {

	
	private int userId;
	
	private String status;
	
	private Date ccreatedAt;

	
	public void setUserId( int userId) {
		
		this.userId=userId;
	}
	public int getUserId() {
		return userId;
		
	}
	public void setStatus(String status) {
		
		this.status=status;
	}
	public String getStatus() {
		return status;
		
	}
	public void setCreatedAt(Date createdAt) {
		this.ccreatedAt=createdAt;
		
	}
	public Date getCreatedAt() {
		return ccreatedAt;
		
	}
}




//Create a class Orders having member variables id, userId, status, createdAt. create getters and 
//setters for all member variables. Create object of Orders class in other class inside main method
//and set all member values and print all member values using getters.