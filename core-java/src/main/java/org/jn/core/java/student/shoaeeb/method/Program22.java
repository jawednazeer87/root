package org.jn.core.java.student.shoaeeb.method;

public class Program22 {

	static int countOnes(int arr[])
	{
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==1)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ones=countOnes(new int[] {12,1,3,4,5,6,1});
		System.out.println(ones);
	}

}
