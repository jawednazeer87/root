package org.jn.core.java.student.shoaeeb.dsa;

public class BinarySearch {
	public static int binarySearch(int arr[],int key,int low,int high)
	{
		int mid=(low+high)/2;
		while(low<=high)
		{
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(key>arr[mid])
			{
				return binarySearch(arr,key,mid+1,high);
			}
			else {
				return binarySearch(arr,key,low,mid-1);
			}
		}

		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int key=11;
		int low=0;
		int high=arr.length-1;
		int res=binarySearch(arr,key,low,high);
//		System.out.println(res);
		if(res==-1)
		{
			System.out.println(key+" is not found");
		}
		else {
			System.out.println(key+ " found at index "+res);
		}
		
	}

}
