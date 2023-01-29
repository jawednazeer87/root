package org.jn.core.java.student.shoaeeb.binarysearch;

import java.util.Arrays;

public class FirstLast {
	static int search(int arr[],int target,boolean firstOcurrence)
	{
		int ans=-1;
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid = low + (high-low)/2;
			if(target>arr[mid])
			{
				low=mid+1;
			}
			else if(target<arr[mid])
			{
				high=mid-1;
			}
			else {
				ans=mid;
				if(firstOcurrence)
				{
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}
		}
		return ans;
		
		
	}
	static int[] firstLast(int arr[],int target)
	{
		int ans[] = {-1,-1};
		int first = search(arr,target,true);
		int last= search(arr,target,false);
		ans[0]=first;
		ans[1]=last;
		return ans;    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,7,8,8,9};
		int newArr[]=firstLast(arr,8);
		System.out.println(Arrays.toString(newArr));
	}

}
