package org.jn.core.java.student.sayed.hassain.collection;

public class User {
	private int userId;
	private String email;
	
	User() {};
	User(int  userId,String email)
	{
		this.userId=userId;
		this.email=email;
	}
	
	//setters
	void setUserId(int userId )
	{
		this.userId=userId;
	}
	void setEmail(String email)
	{
		this.email=email;
	}
	
	int getUserId() {
		return userId;
	}
	String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "{userId=" + userId + ", email=" + email + "}\n";
	}
	
	
}
