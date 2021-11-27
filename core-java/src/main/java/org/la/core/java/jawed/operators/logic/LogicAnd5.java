package org.la.core.java.jawed.operators.logic;

public class LogicAnd5 {

	public static void main(String[] args) {
		
		int x = 1, y = 2;
		boolean res = (++x==2) && (y--==1); 
		
		System.out.println("res: "+res);
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}