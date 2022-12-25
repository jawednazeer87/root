package org.jn.core.java.jawed.clss;

public class BuildExample {

	private int id;
	private String name;
	private String designation;
	private double weight;
	private char gender;
	
	public int getId() {
		return id;
	}
	public BuildExample setId(int id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public BuildExample setName(String name) {
		this.name = name;
		return this;
	}
	public String getDesignation() {
		return designation;
	}
	public BuildExample setDesignation(String designation) {
		this.designation = designation;
		return this;
	}
	public double getWeight() {
		return weight;
	}
	public BuildExample setWeight(double weight) {
		this.weight = weight;
		return this;
	}
	public char getGender() {
		return gender;
	}
	public BuildExample setGender(char gender) {
		this.gender = gender;
		return this;
	}
	
	public void print() {
		System.out.println("{id: "+id+", name: "+name+" ,designation: "+designation+", weight: "+weight+"}");
	}
}
