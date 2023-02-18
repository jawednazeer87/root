package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program49 {
	static int firstHalfArray(int arr[])
	{
		int sum=0;
		for(int i=0; i<arr.length/2; i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int sum=Program49.firstHalfArray(arr);
		System.out.println(sum);
	}

}
