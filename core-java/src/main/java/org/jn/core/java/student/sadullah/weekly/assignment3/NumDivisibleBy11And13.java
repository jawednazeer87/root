package org.jn.core.java.student.sadullah.weekly.assignment3;

public class NumDivisibleBy11And13 {

	public static void main(String[] args) {

		for (int i = 1; i <= 1500; i++) {
			if (i % 11 == 0 || i % 13 == 0) {
				System.out.print(i +" ");
			}
		}
	}
}
