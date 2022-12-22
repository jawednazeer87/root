package org.jn.core.java.jawed.clss;

public class Apple {
	private Integer weight;
	private String taste;
	private String color;
	
	public Apple(int weight, String taste, String color) {
		super();
		this.weight = weight;
		this.taste = taste;
		this.color = color;
	}
	
	public Integer getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getTaste() {
		return taste;
	}
	
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override 
	public String toString() {
		return "{weight: "+weight+", taste: "+taste+", color: "+color+"}";
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	public boolean equals(Object o) {
		return true;
	}
}
