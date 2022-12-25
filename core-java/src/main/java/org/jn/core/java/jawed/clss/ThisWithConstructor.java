package org.jn.core.java.jawed.clss;

public class ThisWithConstructor {

	public ThisWithConstructor() {
		this(1);
		System.out.println("default constructor");
	}
	
	public ThisWithConstructor(int id) {
		this(11, 22);
		System.out.println("one parameter constructor id: "+id);
	}
	
	public ThisWithConstructor(int id, int roll) {
		System.out.println("two parameter constructor id: "+id+", roll: "+roll);
	}
}
