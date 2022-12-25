package org.jn.core.java.jawed.clss;

public class NoDefaultConstructorProb {

	private int id;
	private String name;
	
	public NoDefaultConstructorProb(int i, String nm) {
		id = i;
		name = nm;
	}
	
	public void print() {
		System.out.println("id: "+id);
		System.out.println("name: "+name);
	}
}
