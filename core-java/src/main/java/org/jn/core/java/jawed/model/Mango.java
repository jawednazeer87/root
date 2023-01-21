package org.jn.core.java.student.shoaeeb.model;

public class Mango {

	private String color;
	private String taste;
	private int weight;
	
	public Mango() {}
	
	public Mango(String color, String taste, int weight) {
		this.color = color;
		this.taste = taste;
		this.weight = weight;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "{color: " + color + ", taste: " + taste + ", weight: " + weight + "}"; 
	}
}
