package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ArrayCheckForSpecificValueAndIndex {
	public static void main(String[] argrs) {
		int a [] = {50, 490, 55, 78, 92, 54, 29, 0, 4, 120};
		
		int checkValue = 4;
		int index = 0;
		
		boolean matchFound = false;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == checkValue) {
				matchFound = true;
				index = i;
			}
		}
		
		if (matchFound) {
			System.out.println("The element you searched for " +checkValue +" is in the array in the index of a[" +index +"]");
		}
		else {
			System.out.println("-1");
		}
	}
}
