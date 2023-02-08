package org.jn.core.java.student.shoaeeb.collection.framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayProgram {
	static void display(int arr[])
	{
		for(int ele: arr)
		{
			System.out.println(ele);
		}
	}
	static int binarySearch(int arr[],int key)
	{
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(arr[mid]>key)
			{
				high=mid-1;
			}
			else if(arr[mid]<key)
			{
				low=mid+1;
			}
			else {
				ans=mid;
				break;
			}
		}
		return ans;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of element: ");
		int n=Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		System.out.println("enter elements one by one");
		for(int i=0; i<n; i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		ArrayProgram.display(arr);
		System.out.println("Enter a element to search");
		int search=Integer.parseInt(br.readLine());
		System.out.println(ArrayProgram.binarySearch(arr, search));
		
		
	}

}
