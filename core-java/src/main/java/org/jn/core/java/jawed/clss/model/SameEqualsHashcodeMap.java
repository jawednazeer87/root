package org.jn.core.java.jawed.clss.model;

public class SameEqualsHashcodeMap {
	
	private int id;
	private String name;
	private boolean gender;
	
	public SameEqualsHashcodeMap(int id, String name, boolean gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	public boolean equals(Object that) {
		return true;
	}
	@Override
	public String toString() {
		return "{id: " + id + ", name: " + name + ", gender: " + gender + "}";
	}
	
}
