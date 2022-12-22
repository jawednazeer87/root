package org.jn.core.java.student.shoaeeb.method;

public class Program9 {

	static int avgArray(int arr[])
	{
		int avg=0;
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		avg=sum/arr.length;
		return avg;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int avg=avgArray(arr);
		System.out.println(avg);
	}

}
