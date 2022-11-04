package org.jn.core.java.student.azhan.operators.ternary;

public class PositiveWithoutIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3, b = -10;
		int pos = a>0 ? b>0?1:a : b>0?b:-1;
		System.out.println("Result = "+pos);
	}

}
