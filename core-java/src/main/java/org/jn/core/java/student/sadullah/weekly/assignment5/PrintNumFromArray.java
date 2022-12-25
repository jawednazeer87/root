package org.jn.core.java.student.sadullah.weekly.assignment5;

public class PrintNumFromArray {
	static void printNum(int arr [], int index) {

		boolean indexGreater = true;
		for (int i = 0; i < arr.length; i++) {
			if (index<arr.length-1) {
				if (arr[i] == arr[index]) {
					System.out.println("a[" +i +"] = " +arr[i]);
				}
			}
			else {
				indexGreater = false;
			}
		}
		if (indexGreater == false) {
			System.out.println("No element found within the array for the given index.");
		}
	}
	
	public static void main(String[] argrs) {
		int a [] = {1, 2, 3, 4, 5};
		int index = 0;
		printNum(a, index);
	}
}
