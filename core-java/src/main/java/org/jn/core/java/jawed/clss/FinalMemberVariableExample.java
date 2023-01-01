package org.jn.core.java.jawed.clss;

public class FinalMemberVariableExample {

	final String name;
	final int id;
	
	public FinalMemberVariableExample(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
}
