package org.la.core.java.student.tanseer.assignment5.arrays;

import java.util.Scanner;

public class Program29InsertElementAtSpecificPosition 
{

	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		
		int[] a = new int[size + 1];
		
		System.out.println("Enter the array Elememts : ");
		for(int i = 0 ; i < size ; i++)
		{
			a[i] = sc.nextInt(); 
		}
		
		System.out.println("Enter the item to be inserted : ");
		int item = sc.nextInt();
		
		System.out.println("Enter position to be inserted : ");
		int pos = sc.nextInt();
		
		for(int i = size - 1 ; i >= pos ; i--)
		{
			a[i+1] = a[i];
		}
		
		 a[pos] = item;
		 
		for(int i = 0 ; i < a.length; i++ )
		{
			System.out.print(a[i]+ " ");
		}
		
		sc.close();
	}	
	
}
