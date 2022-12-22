package org.jn.core.java.student.shoaeeb.loopprograms;

import java.util.Arrays;
public class Program24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remove duplicate elements
		
		int arr[]= {1,2,1,3,4,5,1,6};
		int size=arr.length;
		int count[] = new int[size];
		boolean visited[]= new boolean[size];
		int counter=1;
		Arrays.fill(visited, false);
		Arrays.fill(count, 0);
		
		for(int i=0; i<size; i++)
		{
			counter=1;
			for(int j=i+1; j<size; j++)
			{
				if(arr[i]==arr[j])
				{
					counter++;
					count[j]=counter;
				}
			}
		}
		int size1=0;
		for(int i=0; i<arr.length; i++)
		{
			if(count[i]==0)
				size1++;
		}
		//System.out.println(size1);
		int newArray[] = new int[size1];
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			if(count[i]==0)
			{
				newArray[j]=arr[i];
				j++;
			}
				
		}
		
		for(int i=0; i<size1; i++)
		{
			System.out.println(newArray[i]);
		}
	}

}
