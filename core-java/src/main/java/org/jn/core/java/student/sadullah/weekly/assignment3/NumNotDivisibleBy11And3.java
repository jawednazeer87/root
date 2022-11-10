package org.jn.core.java.student.sadullah.weekly.assignment3;

public class NumNotDivisibleBy11And3 {

	public static void main(String[] args) {

		for (int i = 100; i >= 1; i--) {
			if (i % 11 != 0 && i % 3 != 0) {
				System.out.print(i +" ");
			}
		}
	}
}
