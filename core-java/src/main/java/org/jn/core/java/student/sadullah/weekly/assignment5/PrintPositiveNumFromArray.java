package org.jn.core.java.student.sadullah.weekly.assignment5;

public class PrintPositiveNumFromArray {
	static void printPositive(int a []) {
		for (int i = 0; i < a.length; i++) {
			if (a[i]>0) {
				System.out.println("a[" +i +"] = " +a[i]);
			}
		}
	}
	
	
	public static void main(String[] argrs) {
		int arr [] = {-9, 9, 10, -11, 23, 5, 7, -11, -1};
		
		printPositive(arr);
	}
}
