package org.jn.core.java.jawed.operators.bit.wise;

public class RightShift {

	public static void main(String[] args) {
		
		byte x = 10;
		int shift = 5;
		int res = x >> shift;
		System.out.println("Positive right shift "+shift+" times : "+res);
		
		x = -128;
		shift = 1;
		res = x >> shift;
		System.out.println("Negative right shift "+shift+" times : "+res);
		
		x = -128;
		shift = 7;
		res = x >> shift;
		System.out.println("Negative right shift "+shift+" times : "+res);
		
		
		res = res >> 4;
		System.out.println("Negative right shift "+shift+" times : "+res);
	}
}