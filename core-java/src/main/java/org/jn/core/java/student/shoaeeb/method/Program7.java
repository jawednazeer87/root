package org.jn.core.java.student.shoaeeb.method;

public class Program7 {

	static int [] copy(int arr[])
	{
		int arr1[]=new int [arr.length];
		for(int i=0; i<arr.length; i++)
		{
			arr1[i]=arr[i];
		}
		return arr1;
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
		int arr[]= {1,2,3,4,5};
		int newArray[] = copy(arr);
		printArray(newArray);
	}

}
