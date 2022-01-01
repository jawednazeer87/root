package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;
import java.util.Scanner;


public class Question32 {
	//		32) wap to find the second largest element in an array?

	public static void main(String[] args) {
		int arr[] = {6,1,4,7,8,5,4,65,7,8,5,4,7,8};
		int temp = arr[0];
		for (int i = 0 ; i < arr.length; i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Second largest "+arr[arr.length - 2]);

	}
}
