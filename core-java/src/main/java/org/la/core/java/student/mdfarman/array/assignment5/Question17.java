package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;

public class Question17 {
//		17) wap to copy two arrays into one array

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
		int arr2[] = {11,12,13,14,15};
		int copyArr[] = new int[arr1.length+arr2.length];
		int pos = 0 ;
		
		for (int i = 0 ; i < arr1.length ; i++) {
			copyArr[pos] = arr1[i];
			pos++;
		}
		
		for (int i = 0 ; i < arr2.length ; i++) {
			copyArr[pos] = arr2[i];
			pos++;
		}
		
		System.out.println(Arrays.toString(copyArr));
		
		
	}
}
