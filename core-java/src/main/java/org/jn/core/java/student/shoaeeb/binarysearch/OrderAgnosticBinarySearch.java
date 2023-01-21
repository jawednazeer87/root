package org.jn.core.java.student.shoaeeb.binarysearch;

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,9,12,18,22,36,48};
		int arr1[] = {48,36,22,20,18,12,9,8};
		int target=18;
		int ans= orderAgnosticBinarySearch(arr1,target);
		System.out.println(ans);
	}
	
	static int orderAgnosticBinarySearch(int arr[],int target)
	{
		int start=0;
		int end=arr.length-1;
		boolean isAsc = arr[start]<arr[end];
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			if(isAsc)
			{
				if(arr[mid]>target)
				{
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
			else {
				if(arr[mid]<target)
				{
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
		}
		return -1;
	}

}
