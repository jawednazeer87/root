package org.jn.core.java.student.azhan.operators.ternary;

public class EvenWithoutIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 92, b = 1;
		String x = "both", y ="none", num1="first", num2="second";
		String res = a%2==0 ? b%2==0?x:num1 : b%2==0?num2:y;
		System.out.println("Odd Result = "+res);
	}

}
