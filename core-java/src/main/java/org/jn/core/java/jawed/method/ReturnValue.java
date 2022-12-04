package org.jn.core.java.jawed.method;


public class ReturnValue {

	static char charMethod() {
		System.out.println("Hello charMethod");
		return '0';
	}
	public static void main(String[] args) {
		System.out.println("start main");
		char c = charMethod();
		System.out.println("end main value: "+c);
	}
	
	
}
