package org.jn.core.java.student.azhan.methods;

import java.util.*;

public class PrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,67,3,23,546,6,7};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find:");
		int num = sc.nextInt();
		printNum(arr,num);
		
	}
	static void printNum(int arr[], int num)
	{
		for(int x:arr)
			if(x==num)
			{
				System.out.println("Number "+num+" found");
				return;
			}
		System.out.println("Not Found");
		
	}

}
