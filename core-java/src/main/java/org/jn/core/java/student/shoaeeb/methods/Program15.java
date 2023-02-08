package org.jn.core.java.student.shoaeeb.methods;

public class Program15 {
	static int findMax(int ...x)
	{
		int max=Integer.MIN_VALUE;
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
		int res=Program15.findMax(5,6,7);
		System.out.println(res);
		res=Program15.findMax(1);
		System.out.println(res);
	}

}
