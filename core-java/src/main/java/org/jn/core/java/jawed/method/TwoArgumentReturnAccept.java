package org.jn.core.java.jawed.method;


public class TwoArgumentReturnAccept {

	static float sum(int i, float f) {
		System.out.println("sum method");
		float sum = i + f;
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("start main");
		float s = sum(9, 5.4f);
		System.out.println("sum: "+s);
		System.out.println("end main");
	}
	
	
}
