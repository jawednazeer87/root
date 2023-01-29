package org.jn.core.java.student.shoaeeb.binarysearch;

public class Ceiling {
	static int ceiling(int arr[],int target)
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
	    return arr[start];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,6,8,9,15,20};
		System.out.println(ceiling(arr,14));
		}
	}


