package org.jn.core.java.student.shoaeeb.model;

public class Mango {
	private String color;
	private String taste;
	private int weight;
	
	//constructor
	public Mango() {};
	
	public Mango(String color,String taste,int weight)
	{
		this.color=color;
		this.taste=taste;
		this.weight=weight;
	}
	
	//setters
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public void setTaste(String taste)
	{
		this.taste=taste;
	}
	
	public void setWeight(int weight)
	{
		this.weight=weight;
	}
	//getters
	public String getColor()
	{
		return color;
	}
	public String getTaste() {
		return taste;
	}
	public int  getWeight() {
		return weight;
	}
	
	public String toString() {
		return "{color: " + color + ", taste: " + taste + ", weight: " + weight + "}"; 

	}
}
