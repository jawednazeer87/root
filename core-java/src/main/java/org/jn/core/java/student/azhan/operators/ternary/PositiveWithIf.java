package org.jn.core.java.student.azhan.operators.ternary;

public class PositiveWithIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -3, b = -1;
		if(a>0 && b<0)
			System.out.println("Positive number = "+a);
		else if(b>0 && a<0)
			System.out.println("Positive number = "+b);
		else if(a>0 && b>0)
			System.out.println("Both are positive numbers");
		else
			System.out.println("Both are non-positive numbers");
	}

}
