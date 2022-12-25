package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ArrayPositiveNumbersOnly {

	public static void main(String[] args) {
		int a [] = {-12, 24, 8, 90, -26, -62, -8, 0, -10, -89};
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0 ) {
				System.out.println("a[" + i + "] = " + a[i]);
			}
		}
	}
}
