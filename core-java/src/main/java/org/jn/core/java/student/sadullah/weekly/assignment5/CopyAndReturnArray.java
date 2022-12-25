package org.jn.core.java.student.sadullah.weekly.assignment5;

public class CopyAndReturnArray {
	static int [] copy(int a []) {
		int copiedArray [] = new int [a.length];
		
		for (int i = 0; i < a.length; i++) {
			copiedArray [i] = a[i];
		}
		
		return copiedArray;
	}
	
	public static void main(String[] argrs) {
		int arr1 [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int arr2 [] = copy(arr1);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" +i + "] = " + arr2[i]);
		}
	}
}
