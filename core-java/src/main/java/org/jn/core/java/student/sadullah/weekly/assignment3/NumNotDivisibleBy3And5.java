package org.jn.core.java.student.sadullah.weekly.assignment3;

public class NumNotDivisibleBy3And5 {

	public static void main(String[] args) {

		for (int i = 10; i <= 70; i++) {
			if (i % 3 != 0 && i % 5 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
