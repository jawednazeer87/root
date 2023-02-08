package org.jn.core.java.student.shoaeeb.methods;

public class Program14 {
	
	
	static int fibonacci(int n)
	{
		int res=1;
		if(n==1||n==0)
			return 1;
		while(n>=1)
		{
			res=res*n;
			n--;
		}
		return res;
			
	
	}
	public static void main(String args[])
	{
		int res=Program14.fibonacci(5);
		System.out.println(res);
	}
}
