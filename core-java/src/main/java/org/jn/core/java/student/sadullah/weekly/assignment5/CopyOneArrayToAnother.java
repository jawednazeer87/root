package org.jn.core.java.student.sadullah.weekly.assignment5;

import java.util.Iterator;

public class CopyOneArrayToAnother {
	static void copy(int a [], int b []) {
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
	}
	
	
	public static void main(String[] argrs) {
		int arr1 [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int arr2 [] = new int [arr1.length];
		
		copy(arr1, arr2);
		
		System.out.println("Array1 address: " +arr1);
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" +i +"] = " +arr1[i]);
		}
		
		System.out.println("");
		
		System.out.println("Array2 address: " +arr2);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" +i +"] = " +arr2[i]);
		}
	}
}
