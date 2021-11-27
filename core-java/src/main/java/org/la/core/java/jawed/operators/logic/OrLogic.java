package org.la.core.java.jawed.operators.logic;

public class OrLogic {

	public static void main(String[] args) {
		
		boolean res = true || false;
		System.out.println("res: "+res);
		res = true || true;
		System.out.println("res: "+res);
		res = false || false;
		System.out.println("res: "+res);
	}
}
