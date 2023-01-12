package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class Orders {
	
	int id;
	int userId;
	String status;
	String createdAt;
	
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
	
	@Override
	public String toString() {
		return "Orders [id=" + id + ", userId=" + userId + ", status=" + status + ", createdAt=" + createdAt + "]";
	}
	
	
	
}
