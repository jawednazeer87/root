package org.jn.core.java.student.shoaeeb.arrays.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//jagged array
		int arr[][] = new int[2][];
		arr[0]=new int[1];
		arr[1]=new int[2];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<arr[0].length; i++)
		{
			arr[0][i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<arr[1].length; i++)
		{
			arr[1][i]=Integer.parseInt(br.readLine());
		}
		
		
		//printing the array
		System.out.println("Array is: ");
		for(int ele[] : arr)
		{
			for(int element: ele)
			{
				System.out.print(element+" ");
			}
			System.out.println();
		}
	}
	

}
