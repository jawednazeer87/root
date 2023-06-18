package org.jn.core.java.student.mirza.jdbc.model;

public class Countries {
	
	private int Code;
	
	private String Name;
	private String CountinentName;
	
	public Countries () {}

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCountinentName() {
		return CountinentName;
	}

	public void setCountinentName(String countinentName) {
		CountinentName = countinentName;
	}

	@Override
	public String toString() {
		return " {Code=" + Code + ", Name=" + Name + ", CountinentName=" + CountinentName + "}";
		
		
	}
	
	
	
	
	
}
