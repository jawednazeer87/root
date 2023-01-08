package org.jn.core.java.jawed.clss;

public class AbstractClassImplMain {

	public static void main(String[] args) {
		AbstractClass asc = new AbstractClassImpl();
		System.out.println("factorial of 5: "+asc.factorial(5));
		asc.name();
	}
}
