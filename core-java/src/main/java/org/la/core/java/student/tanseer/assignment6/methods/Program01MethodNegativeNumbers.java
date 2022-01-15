package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  void printNegative(int[])
	method will print all positive number from supplied array
 */

public class Program01MethodNegativeNumbers 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		
		int[] a = new int[size];
		System.out.println("Enter array elements : ");
		for(int i  = 0; i < size ; i ++ )
		{
			a[i] = sc.nextInt();
		}
		
		printNegative(a);
		sc.close();
	}
	
	static void printNegative(int[] a)
	{
		System.out.println(Arrays.toString(a));
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] < 0)
			{
				System.out.println("Negative array elements are :"+ a[i]);
			}
		}
	}
}

