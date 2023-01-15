package org.jn.core.java.student.shoaeeb.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program9 {
	//arrays
	//1d array
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[3];
		int total=0;
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		//printing the array
		for(int ele: arr)
		{
			System.out.println(ele);
			total+=ele;
		}
		System.out.println((float)total/arr.length);
	}

}
