package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;
import java.util.Scanner;


public class Question29 {
	//		29) wap to insert an element (specific position) into an array?

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		int newArr[]  = new int[arr.length+1];
		System.out.println("Enter the position");
		int pos = sc.nextInt();
		System.out.println("Enter the element");
		int ele = sc.nextInt();
		
		for(int i = 0 ; i< newArr.length; i++) {
			if (i<pos-1) {
				newArr[i] = arr[i];
			}
			else if (i == pos-1) {
				newArr[i] = ele;
			}
			else {
				newArr[i] = arr[i - 1];
			}
				
		}
		System.out.println(Arrays.toString(newArr));
			
	}
}
