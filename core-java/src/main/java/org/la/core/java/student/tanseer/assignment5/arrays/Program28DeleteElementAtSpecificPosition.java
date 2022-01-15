package org.la.core.java.student.tanseer.assignment5.arrays;

import java.util.Scanner;

public class Program28DeleteElementAtSpecificPosition 
{

	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		
		int[] a = new int[size];
		System.out.println("Enter array elements : ");
		for(int i = 0 ; i < size ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter postion where you want to delete : ");
		int pos = sc.nextInt();
		
		for(int i = pos; i < a.length - 1; i++)
		{
			a[i] = a[i+1];
		}
		
		for(int i = 0; i < a.length - 1; i++)
		{
			System.out.print(a[i]+ " ");
		}
		
		System.out.println(a.length);
		sc.close();
	}	
	
}
