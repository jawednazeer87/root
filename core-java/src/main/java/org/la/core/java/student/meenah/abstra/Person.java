package org.la.core.java.student.meenah.abstra;

public abstract class Person {
	
	private int id;
	public String name;
	protected String email;
	double weight;
	
	public Person() {
		
	}

	public Person(int i , String n, String e, double w) {
		id = i;
		name = n;
		email = e;
		weight = w;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract String getName();

	public void setName(String name) {
		this.name = name;
	}

	public abstract String getEmail();

	public void setEmail(String email) {
		this.email = email;
	}

	public abstract double getWeight();

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
