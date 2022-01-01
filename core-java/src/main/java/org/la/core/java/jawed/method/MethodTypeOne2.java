package org.la.core.java.jawed.method;


public class MethodTypeOne2 {

	public static void main(String[] args) {
		greeting();
		System.out.println("Start");
		greeting();
		greeting();
		System.out.println("End");
		greeting();
	}
	
	static void greeting() {
		System.out.println("Good evening");
	}
}
