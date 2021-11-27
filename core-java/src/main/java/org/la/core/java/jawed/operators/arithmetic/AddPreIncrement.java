package org.la.core.java.jawed.operators.arithmetic;

public class AddPreIncrement {

	public static void main(String[] args) {
		
		int z = 4;
		System.out.println("z: "+z);
		int x =  5 * ++z;
		System.out.println("z: "+z);
		System.out.println("x: "+x);
		
	}
}
