package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Question28 {
	//	28) wap to remove a specific element from an array?


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {8,4,5,7,6,5,4,9,8,5,2,4,5,8,4,5,2};

		System.out.println(Arrays.toString(arr));
		System.out.print("Enter the element you want to delete:");

		int del = sc.nextInt();
		int flag =1;
		int loc = 1;
		
		for (int i = 0; i < arr.length; i++){
			if(arr[i] ==  del){
				flag  =1;
				loc = i;
				break;
			}
			else
				flag = 0;
		}
		
		if(flag == 1){
			for(int i = loc+1; i < arr.length; i++)
				arr[i-1] = arr[i];
			
			System.out.print("After Deleting:");
			
			for (int i = 0; i < arr.length-2; i++) 
				System.out.print(arr[i]+",");
			
			System.out.print(arr[arr.length-2]);
		}
		else
			System.out.println("Element not found");
	}
}
