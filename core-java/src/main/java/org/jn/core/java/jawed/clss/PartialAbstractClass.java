package org.jn.core.java.jawed.clss;

public abstract class PartialAbstractClass {

	public PartialAbstractClass() {
		System.out.println("PartialAbstractClass default constructor");
	}
	
	public void concMethod() {
		System.out.println("this is concrete method");
	}
	
	public abstract void method();
}
