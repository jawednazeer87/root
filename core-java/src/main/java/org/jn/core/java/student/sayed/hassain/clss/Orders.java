package org.jn.core.java.student.sayed.hassain.clss;

public class Orders {
	
	int id;
	String userId;
	String status;
	String createdAt;
	
	public int getterId() {
		return id;
	}
	public String getterUserId() {
		return userId;
	}
	public String getterStatus() {
		return status;
	}
	public String getterCreatedAt() {
		return createdAt;
	}
	public void setterId(int id) {
		this.id=id;
	}
	public void setterUserId(String userId) {
		this.userId=userId;
	}
	public void setterStatus(String status) {
		this.status=status;
	}
	public void setterCreatedAt(String createdAt) {
		this.createdAt=createdAt;
	}

}
