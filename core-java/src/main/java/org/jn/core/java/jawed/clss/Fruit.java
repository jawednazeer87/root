package org.jn.core.java.jawed.clss;

public class Fruit {

	String name;
	String color;
	String taste;
	
	public void setter(String nm, String clr, String tst) {
		name = nm;
		color = clr;
		taste = tst;
	}
	
	public void print() {
		System.out.println("name: "+name);
		System.out.println("color: "+color);
		System.out.println("taste: "+taste);
	}
}
