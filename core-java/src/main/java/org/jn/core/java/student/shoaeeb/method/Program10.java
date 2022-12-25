package org.jn.core.java.student.shoaeeb.method;
import java.util.*;
public class Program10 {

	static int greatest(int arr[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,6,9,99,11,22};
		int max=greatest(arr);
		System.out.println(max);
	}
}
