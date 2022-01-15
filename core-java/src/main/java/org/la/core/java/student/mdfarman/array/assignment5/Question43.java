package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;
import java.util.Scanner;


public class Question43 {
//	43)	wap to multiply 3 to each element of an array
//	Suppose given array is [10, 19, 2, 7] -> answer 30, 57, 6, 21

	public static void main(String[] args) {
		int arr[] = {10, 19, 2, 7};
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] *= 3;
		}
		System.out.println(Arrays.toString(arr));
			
	}
}
