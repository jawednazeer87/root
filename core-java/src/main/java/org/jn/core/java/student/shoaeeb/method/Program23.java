package org.jn.core.java.student.shoaeeb.method;

public class Program23 {

	static int countZeroes(int arr[])
	{
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zeroes=countZeroes(new int[] {12,1,3,4,5,6,1,0,1,2,0});
		System.out.println(zeroes);
	}

}
