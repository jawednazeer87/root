package org.jn.core.java.jawed.method;


public class OneArgument2 {

	static void even(int i) {
		System.out.println("num "+i+" is "+(i%2==0?"even":"odd"));
	}
	public static void main(String[] args) {
		System.out.println("start main");
		int n = 501;
		even(n);
		System.out.println("end main");
	}
	
	
}
