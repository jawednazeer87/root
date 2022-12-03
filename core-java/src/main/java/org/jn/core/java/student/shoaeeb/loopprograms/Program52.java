package org.jn.core.java.student.shoaeeb.loopprograms;

import java.lang.Math;
public class Program52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	52)	wap to add all elements of an array and check wether the sum is a prime number or not?
		int arr[]= {10,8,2,9};
		int sum=0;
		int counter=0;
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		
		for(int j=2; j<Math.sqrt(sum); j++)
		{
			if(sum%j==0)
			{
				counter=1;
				break;
			}
		}
		
		if(counter==0)
		{
			System.out.println(sum+ "is prime number");
		}
		else {
			System.out.println(sum+ "is not prime number");

		}
		
	}

}
