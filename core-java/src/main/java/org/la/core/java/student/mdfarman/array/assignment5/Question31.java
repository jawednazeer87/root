package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;
import java.util.Scanner;


public class Question31 {
	//		31) wap to remove duplicate elements from an array?

	public static void main(String[] args) {
		int arr1[] = {6,1,4,7,8,5,4,65,7,8,5,4,7,8};
		int arr2[] = new int[arr1.length];
		int pos = 0;
		for(int i = 0; i<arr1.length; i++) {
			for(int j = i+1 ; j<arr1.length; j++) {
				if (arr1[i]==arr1[j]) {
					arr2[pos] = arr1[j];
					pos++;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));

	}
}
