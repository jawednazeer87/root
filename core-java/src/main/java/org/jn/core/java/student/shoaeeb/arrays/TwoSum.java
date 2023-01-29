package org.jn.core.java.student.shoaeeb.arrays;

import java.util.Arrays;

public class TwoSum {
	static int[] sumArray(int arr[],int target)
	{
		int m=-1;
		int n=-1;
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum=0;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					return new int[] {i,j};
				}
			}
		}
		return new int[]{m,n};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {3,2,3};
		int arr[]=sumArray(nums,6);
		System.out.println(Arrays.toString(arr));
		
	}

}
