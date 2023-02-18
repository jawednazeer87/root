package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program28 {
	//count the number of ones in the array
	static int countOnes(int arr[])
	{
		int count=0;
		for(int ele: arr)
		{
			if(ele==1)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,6,1,5,1};
		int count=Program28.countOnes(arr);
		System.out.println(count);
	}

}
