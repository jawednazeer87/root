package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ArraysCommonElementsBetweenTwo {
	public static void main(String[] argrs) {
		int a [] = {1, 2, 3, 4, 5};
		int b [] = {4, 5, 6, 7, 8};

		int common [] = new int [a.length];
		
		int count = 0;
		
		for (int i : a) {
			for (int j : b) {
				if (i == j) {
					common[count] = i;
					count++;
					break;
				}
			}
		}
		int finalArr [] = new int [count];
		for (int i = 0; i < count; i++) {
			finalArr[i] = common[i];
		}
		
		System.out.print("The common values between the two arrays are:");
		for (int i = 0; i < count; i++) {
			if (i<count-1) {
				System.out.print(" "+a[i] + ", ");
			}
			else {
				System.out.print("and " +a[i]);
			}
		}
	}
}
