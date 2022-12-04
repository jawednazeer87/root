package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	47)	wap to count all 1's of an int array
		
		int arr[]= {1,2,3,4,5,1,1,1};
		int count=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==1)
			{
				count++;
			}
		}
		
		System.out.println("Count of 1: "+count);
	}

}
