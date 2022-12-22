package org.jn.core.java.student.shoaeeb.method;

public class Program8 {

	static int SumArray(int arr[])
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int sum=SumArray(arr);
		System.out.println(sum);
	}

}
