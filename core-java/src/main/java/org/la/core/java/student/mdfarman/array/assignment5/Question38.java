package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;


public class Question38 {
//	38) Find largest and smallest elements of an array? 

	public static void main(String[] args) {
		int arr[] = {5,4,1,2,5,87,8,96,5,3,4,74};
		Arrays.sort(arr);
		System.out.println("Largest : "+arr[arr.length-1]);
		System.out.println("Smallest : "+arr[0]);
		

	}
}
