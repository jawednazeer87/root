package org.jn.core.java.jawed.operators.bit.wise;

public class ComplementExample {

	public static void main(String[] args) {
		
		byte x = 100;
		x = (byte)~x;
		System.out.println("value : "+x);
	}
}