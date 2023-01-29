package org.jn.core.java.student.shoaeeb.binarysearch;

public class CharacterArray {
	static int nextGreaterLetter(char arr[],char target)
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
	        if(target<arr[mid]){
	            end=mid-1;
	        }
	    }
	    return arr[start%arr.length];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'a','b'};
		char ans = 	(char) nextGreaterLetter(arr,'z');
		System.out.println(ans);

	}

}
