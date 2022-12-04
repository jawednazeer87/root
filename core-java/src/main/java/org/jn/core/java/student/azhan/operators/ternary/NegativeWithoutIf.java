package org.jn.core.java.student.azhan.operators.ternary;

public class NegativeWithoutIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -91, b = -1;
		String num1 = "first number is", num2 = "second number is";
		String x = "both numbers are", y = "none of them is";
		String neg = a<0 ? b<0?x:num1 : b<0?num2:y;
		System.out.println(neg+" negative");
	}

}
