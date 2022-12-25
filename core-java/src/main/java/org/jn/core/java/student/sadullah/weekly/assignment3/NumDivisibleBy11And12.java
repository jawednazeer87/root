package org.jn.core.java.student.sadullah.weekly.assignment3;

public class NumDivisibleBy11And12 {

	public static void main(String[] args) {
		
		for (int i = 10; i <= 300; i++) {
			if (i % 11 ==0 || i % 12 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
