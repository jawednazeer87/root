package org.jn.core.java.student.shoaeeb.practice;

public class VArgs {
	public static int sum(int ...x)
	{
		int max=x[0];
		for(int i=0; i<x.length; i++)
		{
			if(x[i]>max)
			{
				max=x[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,6,9,2,5};
		System.out.println("maximum numbers " +sum(arr));
	}

}
