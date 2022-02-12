package org.la.core.java.student.majeed.assignment8;

/*
11.	Create a class Orders having member variables id, userId, status, createdAt. create getters and 
	setters for all member variables. Create object of Orders class in other class inside main method
	and set all member values and print all member values using getters.
 */

public class Orders {
	private int id;
	private int userId; 
	private String status;
	private String createdAt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
		
}
