package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;
import java.util.Scanner;


public class Question30 {
	//		30) wap to find the common elements between two arrays?

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {5,2,4,7,8,9,6,4};
		
		for (int i = 0 ; i<arr1.length; i++) {
			for (int j = 0 ; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
			
	}
}
