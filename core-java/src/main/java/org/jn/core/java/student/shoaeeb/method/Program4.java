package org.jn.core.java.student.shoaeeb.method;

public class Program4 {

	static void printOdd(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
				System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,34,5,6,9,-2,-1,5,-6};
		printOdd(arr);
	}

}
