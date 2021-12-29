package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;
import java.util.Scanner;


public class Question44 {
//	44)	wap to to divide each element of an array by 2.
//	Suppose given array is [10, 19, 2, 7] -> our program will divide each element by 2
//	then answer should be 10/2, 19/2, 2, 7/2 = 5, 9, 3, 1

	public static void main(String[] args) {
		int arr[] = {10, 19, 2, 7};
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] /= 2;
		}
		System.out.println(Arrays.toString(arr));
			
	}
}
