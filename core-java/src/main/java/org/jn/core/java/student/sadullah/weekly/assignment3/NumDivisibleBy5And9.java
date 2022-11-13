package org.jn.core.java.student.sadullah.weekly.assignment3;

public class NumDivisibleBy5And9 {

	public static void main(String[] args) {
		
		for (int i = 10; i <= 50; i++) {
			if (i % 5 == 0 || i % 9 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
