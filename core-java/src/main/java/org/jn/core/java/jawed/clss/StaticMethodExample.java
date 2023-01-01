package org.jn.core.java.jawed.clss;

public class StaticMethodExample {
	
	public static void main(String[] args) {
		staticMethod();
//		instanceMethod();
	}
	
	public static void staticMethod() {
		System.out.println("This is static method");
	}
	
	public void instanceMethod() {
		
		staticMethod();
		System.out.println("This is instance method");
	}
	
	public static void staticMethod2() {
		StaticMethodExample ex = new StaticMethodExample();
		ex.instanceMethod();
		System.out.println("This is static method2");
	}

}
