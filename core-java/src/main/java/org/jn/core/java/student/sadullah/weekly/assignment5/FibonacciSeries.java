package org.jn.core.java.student.sadullah.weekly.assignment5;

public class FibonacciSeries {
	static void fibonacci(int num) {
		int a = 0, b =1;
		
		System.out.print(a +" " +b);

		
		for (int i = 0; i < num; i++) {
			int c = a + b;
			System.out.print(" " +c + " ");
			a = b;
			b = c;
		}
	}
	
	public static void main(String[] argrs) {
		int num = 10;
		fibonacci(num);		
	}
}
