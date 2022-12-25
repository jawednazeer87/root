package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ArrayEnterSpecificValue {
	public static void main(String[] argrs) {
		int a [] = {3, 7, 2, 9, 5, 1, 8, 6, 4};

		int newValue = 10;
		int index = 4;
		
		int b [] = new int [a.length+1];
		
		for (int i = 0; i < b.length; i++) {
			if (i < index) {
				b[i] = a[i];
			} else if (i == index) {
				b[i] = newValue;
			} else {
				b[i] = a[i-1];
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
