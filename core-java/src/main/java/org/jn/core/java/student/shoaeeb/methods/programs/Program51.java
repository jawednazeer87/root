package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program51 {
	static String returnSizeInString(int a[])
	{
		int n=a.length;
		if(n%2==0 & n!=0)
		{
			return "even";
		}
		else if(n%2!=0)
		{
			return "odd";
		}
		return "zero";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[0];
		System.out.println(Program51.returnSizeInString(arr));
		
	}

}
