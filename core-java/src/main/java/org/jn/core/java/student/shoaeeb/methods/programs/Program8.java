package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program8 {
	//find the sum of the array and return sum
	static int sumArray(int arr[])
	{
		int sum=0;
		for(int ele: arr)
		{
			sum+=ele;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  = {1,2,3,4,5};
		int sum=Program8.sumArray(arr);
		System.out.println("Sum:"+sum);
		
	}

}
