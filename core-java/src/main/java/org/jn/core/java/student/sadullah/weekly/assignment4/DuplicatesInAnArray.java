package org.jn.core.java.student.sadullah.weekly.assignment4;

public class DuplicatesInAnArray {

	public static void main(String[] args) {
		int a [] = {1, 2, 2, 5, 6, 7, 8, 9, 10, 10, 8, 7};
		
		System.out.println("Duplicate elements in the array found are:");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}
}
