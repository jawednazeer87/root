package org.jn.core.java.student.azhan.operators.ternary;

public class SmallestWithoutIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 10;
		String x = "same magnitude", num1="first", num2="second";
		String res = a<b ? num1: b<a?num2:x;
		System.out.println("Smallest Result = "+res);
	}

}
