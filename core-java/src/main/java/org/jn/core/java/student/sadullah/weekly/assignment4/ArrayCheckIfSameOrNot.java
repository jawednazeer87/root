package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ArrayCheckIfSameOrNot {
	public static void main(String[] argrs) {
		int a [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int b [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		if (a.length == b.length) {
			for (int i = 0; i < b.length; i++) {
				if (a[i] == b [i]) {
					System.out.println("Both arrays are equal.");
				}
				else {
					System.out.println("Arrays are not equal");
				}
			}
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}
}
