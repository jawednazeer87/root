package org.jn.core.java.student.shoaeeb.method;

public class Program12 {

	static int[] addTwoArray(int arr[],int arr1[])
	{
		int newArray[] = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			newArray[i]=arr[i]+arr1[i];
			
		}
		return newArray;
	}
	static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5,6};
		int arr1[]= {2,6,7,5,3};
		int newArray[] = addTwoArray(arr,arr1);
		printArray(newArray);
	}

}
