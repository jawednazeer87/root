package org.jn.core.java.jawed.method;


public class TwoArgument {

	static void even(int i, float f) {
		System.out.println("i: "+i+", f: "+f);
	}
	public static void main(String[] args) {
		System.out.println("start main");
		even(9, 5.4f);
		System.out.println("end main");
	}
	
	
}
