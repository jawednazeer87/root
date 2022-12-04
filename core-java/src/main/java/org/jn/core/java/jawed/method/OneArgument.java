package org.jn.core.java.jawed.method;


public class OneArgument {

	static void even(int i) {
		System.out.println("is "+i+" is even num: "+(i%2==0));
	}
	public static void main(String[] args) {
		System.out.println("start main");
		even(9);
		System.out.println("end main");
	}
	
	
}
