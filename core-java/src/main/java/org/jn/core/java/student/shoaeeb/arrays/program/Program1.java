package org.jn.core.java.student.shoaeeb.arrays.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size of the array");
		int n=Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		System.out.println("Enter element");
		for(int i=0; i<n; i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Array elements are:");
		for(int ele: arr)
		{
			System.out.println(ele);
		}
	}

}
