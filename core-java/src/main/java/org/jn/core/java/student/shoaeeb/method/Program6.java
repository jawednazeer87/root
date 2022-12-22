package org.jn.core.java.student.shoaeeb.method;

public class Program6 {

	static void copy(int arr[],int arr1[])
	{
		for(int i=0; i<arr.length; i++)
		{
			arr1[i]=arr[i];
		}
	}
	static void printArray(int arr1[])
	{
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,1,2,3,9};
		int arr1[] = new int[arr.length];
		copy(arr,arr1);
		printArray(arr1);
	}

}
