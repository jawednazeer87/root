package org.la.core.java.jawed.operators.arithmetic;

public class ProdPostIncrement {

	public static void main(String[] args) {
		
		int z = 4;
		int x =  5 * z++;
		System.out.println("x: "+x);
		System.out.println("z: "+z);
	}
}
