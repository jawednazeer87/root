package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ArrayNegativeNumbersOnly {

	public static void main(String[] args) {
		int a [] = {700, -29, 92, 6, 4, 3, -12, -1, 2, -134, -40, -72, 12, 10, 14};
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				System.out.println("a[" + i + "] = " +a[i]);
			}
		}
	}
}
