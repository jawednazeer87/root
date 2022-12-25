package org.jn.core.java.jawed.clss;

public class ThisClass {

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		ThisClass ss = new ThisClass();
		ss.id = id;
//		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
