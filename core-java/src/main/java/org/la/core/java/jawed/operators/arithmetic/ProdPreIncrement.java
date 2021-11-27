package org.la.core.java.jawed.operators.arithmetic;

public class ProdPreIncrement {

	public static void main(String[] args) {
		
		int z = 4;
		int y = 7;
		System.out.println("z: "+z);
		int x =  5 * ++z + y++;
		System.out.println("z: "+z);
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}
