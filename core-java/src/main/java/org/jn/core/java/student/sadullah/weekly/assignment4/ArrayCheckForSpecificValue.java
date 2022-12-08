package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ArrayCheckForSpecificValue {
	public static void main(String[] argrs) {
		int a [] = {1, 450, 50, 0, 40, 56, 90, 100, 24};
		
		int searchValue = 2;
		
		boolean matchFound = false;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == searchValue) {
				matchFound = true;
			}
		}
		
		if (matchFound) {
			System.out.println("The array contains the value you searched for: " +searchValue);
		}
		else {
			System.out.println("The array does not contain the value you searched for.");
		}
	}
}
