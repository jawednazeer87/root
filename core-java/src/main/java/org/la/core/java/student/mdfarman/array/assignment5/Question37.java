package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;


public class Question37 {
	//		37) wap to separate even and odd numbers of a given array of integers. Put all even numbers first, and 
	//	then odd numbers ?



	public static void main(String[] args) {
		int arr[] = {5,4,1,2,5,87,8,96,5,3,4,74};
		System.out.println(Arrays.toString(arr));
		System.out.print("even numbers are: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(" "+arr[i]);
			}
		}
		System.out.println();
		System.out.print("Odd numbers are :");
		for (int i = 0 ; i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(" "+arr[i]);				
			}
		}

	}
}
