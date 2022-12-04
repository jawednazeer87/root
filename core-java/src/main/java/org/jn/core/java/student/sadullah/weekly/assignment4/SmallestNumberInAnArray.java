package org.jn.core.java.student.sadullah.weekly.assignment4;

public class SmallestNumberInAnArray {

	public static void main(String[] args) {
		int a [] = {1, 2, 900, -20, 5602, 0, -12};
		int smallest = 0;
		int index = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (smallest > a[i]) {
				smallest = a[i];
				index = i;
			}
		}
		System.out.println("The smallest number in the array is: " + "a[" +index + "] = " + smallest);
	}
}
