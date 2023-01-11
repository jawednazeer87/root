package org.jn.core.java.student.shoaeeb.absclss;

public abstract class UsersAbsClass {
	int id;
	String fullName;
	String email;
	String gender;
	int countryCode;
	
	//setters
	public abstract void setId(int id);
	public abstract void setFullName(String fullName);
	public abstract void setEmail(String email);
	public abstract void setCountryCode(int countryCode);
	
	
	//getters
	public abstract int getId();
	public abstract String getFullName();
	public abstract String getEmail();
	public abstract int getCountryCode();
	
	
}
