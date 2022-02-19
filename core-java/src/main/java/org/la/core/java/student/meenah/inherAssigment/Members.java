package org.la.core.java.student.meenah.inherAssigment;

public class Members {
	
	private int id;
	public String name;
	protected String email;
	double weight;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setWeight(double weight) {
	this.weight = weight;
}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public double getWeight() {
		return weight;
	}
}
