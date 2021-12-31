package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;
import java.util.Scanner;


public class Question40 {
//	40)	wap to add 5 to each element of an array

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] += 5;
		}
		System.out.println(Arrays.toString(arr));
			
	}
}
