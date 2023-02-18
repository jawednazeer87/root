package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program3 {
	//program to print even 
	static void printEven(int arr[])
	{
		for(int ele: arr)
		{
			if(ele%2==0)
			{
				System.out.println(ele);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  = {1,2,3,4,5,6,7,8,9};
		Program3.printEven(arr);
	}

}
