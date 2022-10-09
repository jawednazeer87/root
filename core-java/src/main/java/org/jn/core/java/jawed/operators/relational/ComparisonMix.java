package org.jn.core.java.jawed.operators.relational;

public class ComparisonMix {

	public static void main(String[] args) {
		int x = 5, y = 5;
		boolean b = x != ++y;
		System.out.println("b: "+b);
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}