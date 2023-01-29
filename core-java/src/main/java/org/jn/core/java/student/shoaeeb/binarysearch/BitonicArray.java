package org.jn.core.java.student.shoaeeb.binarysearch;

public class BitonicArray {
	//find the peak element
	public static int findPeak(int arr[])
	{
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
			{
				end=mid;
			}
			else {
				start=mid+1;
			}
		}
		return arr[start];
		
		
	}
	public static void main(String args[])
	{
		int arr[] = {4,5,1,2,3};
		System.out.println(findPeak(arr));
		
	}
}
