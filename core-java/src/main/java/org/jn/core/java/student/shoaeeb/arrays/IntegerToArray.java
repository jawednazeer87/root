package org.jn.core.java.student.shoaeeb.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerToArray {
	
	static void IntToArray(long num[],long k)
	{
		long number=0;
		for(int i=0; i<num.length; i++)
		{
			number=number*10+num[i];
		}
		number=number+k;
		ArrayList<Long> list = new ArrayList<>();
		while(number>0)
		{
			long n=number%10;
			list.add(n);
			number=number/10;
		}
		Collections.reverse(list);
		System.out.println(list);
		
    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arr[]= {9,9,9,9,9,9,9,9,9,9};
		long k=1;
		IntToArray(arr,k);
	}

}
