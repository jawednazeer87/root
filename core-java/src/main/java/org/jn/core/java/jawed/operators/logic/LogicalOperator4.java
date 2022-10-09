package org.jn.core.java.jawed.operators.logic;

public class LogicalOperator4 {

	public static void main(String[] args) {
		int x=2, y=2;
		boolean b = x==y && y++==3;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("b: "+b);
		
	}
}