package org.jn.core.java.student.shoaeeb.clsses;

public class Mango {
	private int weight;
	private String color;
	private String taste;
	
	
	//constructor
	public Mango() {
		
	}
	
	public Mango(int weight, String color, String taste)
	{
		this.weight=weight;
		this.color=color;
		this.taste=taste;
	}
	
	//setters
	public void setWeight(int weight)
	{
		this.weight=weight;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setTaste(String taste)
	{
		this.taste=taste;
	}
	
	///getters
	public int getWeight() {
		return weight;
	}
	public String getColor()
	{
		return color;
	}
	public String getTaste() {
		return taste;
	}

	@Override
	public String toString() {
		return "{weight=" + weight + ", color=" + color + ", taste=" + taste + "}\n";
	}
	
	
}
