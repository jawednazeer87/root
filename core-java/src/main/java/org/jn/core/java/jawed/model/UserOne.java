package org.jn.core.java.jawed.model;

public class UserOne {

	private int id;
	private String name;
	
	public UserOne(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "{\n   id: " + id + ", \n   name: " + name + "\n}";
	}
	
}