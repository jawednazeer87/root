package org.jn.core.java.student.shoaeeb.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class PlusOne {
	static void IntToArray(int arr[])
	{
		int number=0;
		for(int i=0; i<arr.length; i++)
		{
			number=number*10+arr[i];
		}
		number=number+1;
		ArrayList<Integer> list =new ArrayList<>();
		int n=0;
		while(number>0)
		{
			n=number%10;
			list.add(n);
			number=number/10;
				
		}
		Collections.reverse(list);
		System.out.println(list);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		IntToArray(arr);
		
	}

}
