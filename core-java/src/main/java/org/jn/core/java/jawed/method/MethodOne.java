package org.jn.core.java.jawed.method;


public class MethodOne {

	static void greeting() {
		System.out.println("Hello method");
	}
	public static void main(String[] args) {
		greeting();
		System.out.println("start main");
		greeting();
		System.out.println("end main");
		greeting();
	}
	
	
}
