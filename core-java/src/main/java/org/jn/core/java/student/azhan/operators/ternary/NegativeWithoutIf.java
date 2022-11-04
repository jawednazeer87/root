package org.jn.core.java.student.azhan.operators.ternary;

public class NegativeWithoutIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 0;
		int neg = a<0 ? b<0?-1:a : b<0?b:1;
		if(neg == -1)
			System.out.println("Both are negative numbers");
		else if(neg == 1)
			System.out.println("Both are non-negative numbers");
		else
			System.out.println("Result = "+neg);
	}

}
