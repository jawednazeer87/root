package org.jn.core.java.student.shoaeeb.arrays;

public class Program7 {
	//count the number of good pairs
	//where arr[i]==arr[j] and i<j
	static void countPairs(int arr[])
	{
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]==arr[j] && i<j)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,1};
		
		
		countPairs(arr);
	}

}
