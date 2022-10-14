package org.jn.core.java.jawed.model;

public class Robot {

	private int privateVariable;
	public int publicVariable;
	int defaultVariable;
	protected int protectedVariable;
	
	private void privateMethod() {
		System.out.println("private method in Robot");
	}
	public void publicMethod() {
		System.out.println("public method in Robot");
	}
	void defaultMethod() {
		System.out.println("default method in Robot");
	}
	protected void protectedMethod() {
		System.out.println("protected method in Robot");
	}
}