package org.jn.core.java.jawed.method;


public class MethodOneVoidWithReturn {

	static void greeting() {
		System.out.println("Hello method");
		return;
	}
	public static void main(String[] args) {
		greeting();
		System.out.println("start main");
		greeting();
		System.out.println("end main");
		greeting();
	}
	
	
}
