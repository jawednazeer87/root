package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program22 {
	
	
	public static int fact(int n)
	{
		if(n==0|| n==1)
		{
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(fact(arr[i]));
		}
	}

}
