package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program29 {
	//count the number of zeroes
	static int countZeroes(int arr[])
	{
		int count=0;
		for(int ele: arr)
		{
			if(ele==0)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,1,2,3,0};
		int count=countZeroes(arr);
		System.out.println(count);
	}

}
