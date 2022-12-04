package org.jn.core.java.student.shoaeeb.loopprograms;

import java.lang.Math;
public class Program51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 	51) wap to count all prime numbers of an array?
		int arr[]= {100,19,2,7,50};
		int count=0;
		for(int i=0; i<arr.length; i++)
		{	
			
			for(int j=2; j<Math.sqrt(arr[i]); j++)
			{
				if(arr[i]%j==0)
				{
					break;
				}
				
			}
			
		}
		
		System.out.println(count);
	}

}
