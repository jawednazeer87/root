package org.jn.core.java.student.shoaeeb.method;

public class Program3 {

	static void printEven(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
				System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,34,5,6,9,4,3};
		printEven(arr);
	}
}
