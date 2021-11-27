package org.la.core.java.jawed.operators.relational;

public class ComparisonMixPost {

	public static void main(String[] args) {
		
		int x = 5, y = 5;
		
		boolean b = x != y++;
		
		System.out.println("b: "+b);
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}