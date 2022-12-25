package org.jn.core.java.jawed.clss;

public class BasicParent {

	private void privateMethod() {
		System.out.println("private - this is private method not accessible");
	}
	
	public void publicMethod() {
		System.out.println("public - accessible from anywhere");
	}
	
	void defaultMethod() {
		System.out.println("default - only accessible inside same package");
	}
	
	protected void protectedMethod() {
		System.out.println("proteced - only accessible inside same package as well as"
				+ "different apckage but in child");
	}
}
