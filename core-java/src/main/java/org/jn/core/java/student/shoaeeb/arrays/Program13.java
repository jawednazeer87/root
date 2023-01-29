package org.jn.core.java.student.shoaeeb.arrays;

import java.util.Arrays;

public class Program13 {
	//shuffle array
	static void shuffleArray(int arr[],int s,int e,int n)
	{
		int[] newArr = new int[2*n];
		int i=0;
		while(i<=n+1)
		{
			newArr[i++]=arr[s++];
			newArr[i++]=arr[e++];
		}
		
		System.out.println(Arrays.toString(newArr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int n=3;
		shuffleArray(arr,0,n,n);
	}

}
