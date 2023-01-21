package org.jn.core.java.student.shoaeeb.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,9,12,18,22,36,48};
		int target=18;
		int ans= binarySearch(arr,target);
		System.out.println(ans);
	}
	static int binarySearch(int arr[],int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target>arr[mid])
			{
				start=mid+1;
			}
			else if(target<arr[mid])
			{
				end=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
		
	}

}
