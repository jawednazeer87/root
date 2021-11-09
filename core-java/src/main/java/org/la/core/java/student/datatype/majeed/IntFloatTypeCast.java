package org.la.core.java.student.datatype.majeed;

public class IntFloatTypeCast {

	public static void main(String[] args) {
		int a = 9;
		double d1 = 10.5;
		double upperTypeCast = a * d1;
		System.out.println("Upper Type Cast Result: "+upperTypeCast);
		int lowerTypeCast = (int)upperTypeCast; /*type casting double to int */
		System.out.println("Lower Type Cast Result: "+lowerTypeCast);
	}

}
