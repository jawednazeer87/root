package org.jn.core.java.student.shoaeeb.method;

public class Program5 {
	static void printNum(int arr[],int n)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==n)
			{
				System.out.println("found");
				return;
			}
		}
		System.out.println("not found");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,34,5,6,9,-2,-1,5,-6};
		int n=5;
		printNum(arr,n);
	}

}
