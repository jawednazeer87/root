package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;

public class Question18 {
//		18) wap to add two array elements n copy into third array

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
		int arr2[] = {11,12,13,14,15};
		int copyArray[] = new int[arr1.length+arr2.length];
		int pos = 0;
		
		for(int i = 0; i<arr1.length; i++) {
			copyArray[pos] = arr1[i];
			pos++;
		}
		for(int i = 0; i<arr2.length;i++) {
			copyArray[pos] = arr2[i];
			pos++;
		}
		System.out.println(Arrays.toString(copyArray));
		
		int sum = 0;
		
		for(int i=0;i<copyArray.length;i++) {
			sum += copyArray[i];
		}
		System.out.println(sum);
		
	}
}
