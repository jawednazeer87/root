package org.jn.core.java.student.sadullah.weekly.assignment5;

public class FactorialOfGivenNum {
	static long factorial(int a) {
		long result = 1;
		for (int i = 2; i <= a ; i++) {
			result = result * i;
		}
		return result;
	}
	
	
	public static void main(String[] argrs) {
		long fact = factorial(20);
		System.out.println(fact);
	}
}
