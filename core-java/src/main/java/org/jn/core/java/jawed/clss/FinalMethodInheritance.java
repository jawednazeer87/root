package org.jn.core.java.jawed.clss;

public class FinalMethodInheritance {

	// final method cannot be overridden by its child class
	public final void finalMethod() {
		System.out.println("parent final method");
	}
	
	public void method() {
		System.out.println("parent method");
	}
}
