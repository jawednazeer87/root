package org.la.core.java.jawed.datatype;

public class IntFloatTypeCast {

	public static void main(String[] args) {
		
		int a = 1;
		double f = 5.5;
		double pro = a * f;
		int mul = (int)(a * f);
		System.out.println("Pro: "+pro);
		System.out.println("mul: "+mul);
	}
}
