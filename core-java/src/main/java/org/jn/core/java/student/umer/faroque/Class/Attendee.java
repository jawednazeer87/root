package org.jn.core.java.student.umer.faroque.Class;

public class Attendee {
	private String firstName;
	private String lastName;
	private long phone;
	private String email;
	
	//setters
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public void setPhone(long phone)
	{
		this.phone=phone;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	//getters
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public long getPhone()
	{
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
}
