package org.jn.core.java.student.sadullah.weekly.assignment2;

public class CompareTwoNumbersBoolean {

	public static void main(String[] args) {
		int a = 10, b =50;
		System.out.println("a = " +a +", b = " +b);
		boolean b1 = a>b, b2 = a>=b, b3 = a==b, b4 = a<b, b5 = a<=b, b6 = a!=b;
		
		System.out.println("a is greater than b: " +b1);
		System.out.println("a is greater than or equal to b: " +b2);
		System.out.println("a is equal to b: " +b3);
		System.out.println("a is lesser than b: " +b4);
		System.out.println("a is lesser than or equal to b: " +b5);
		System.out.println("a is not equal to b: " +b6);
	}
}
