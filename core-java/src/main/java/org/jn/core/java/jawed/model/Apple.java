package org.jn.core.java.jawed.model;

public class Apple {
	
	private Integer weight;
	private String taste;
	private String color;
	
	/**
	 * zero @param constructor
	 * Also called default constructor
	 */
	public Apple() {}
	
	/**
	 * @param weight
	 * @param taste
	 * @param color
	 */
	public Apple(Integer weight, String taste, String color) {
		this.weight = weight;
		this.taste = taste;
		this.color = color;
	}
	/**
	 * @return the weight
	 */
	public Integer getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	/**
	 * @return the taste
	 */
	public String getTaste() {
		return taste;
	}
	/**
	 * @param taste the taste to set
	 */
	public void setTaste(String taste) {
		this.taste = taste;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override 
	public String toString() {
		return "{weight: "+weight+", taste: "+taste+", color: "+color+"}";
	}
}