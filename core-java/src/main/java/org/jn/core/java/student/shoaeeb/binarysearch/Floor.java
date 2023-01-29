package org.jn.core.java.student.shoaeeb.binarysearch;

public class Floor {
	static int floor(int arr[],int target)
	{
		int start=0;
	    int end=arr.length-1;
	    while(start<=end)
	    {
	         int mid=start+(end-start)/2;
	        
	        if(arr[mid]==target)
	        {
	            return arr[mid];
	        }
	        else if(target>arr[mid])
	        {
	            start=mid+1;
	        }
	        else {
	            end=mid-1;
	        }
	    }
	    return arr[end];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,9,12,16};
		System.out.println(floor(arr,3));
	}

}
