package org.jn.core.java.student.shoaeeb.method;
import java.util.*;
public class Program11 {

	static int smallest(int arr[])
	{
		int min=Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,6,9,99,11,22};
		int min=smallest(arr);
		System.out.println(min);
	}

}
