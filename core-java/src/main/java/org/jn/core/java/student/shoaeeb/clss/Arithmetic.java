package org.jn.core.java.student.shoaeeb.clss;

public class Arithmetic {
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
	public int  prod(int a,int b)
	{
		return a*b;
	}
	public void fibonacci(int s)
	{
		int a=0;
		int b=1;
		int c=a+b;
		System.out.println(a);
		System.out.println(b);
		while(c<=s)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(b);
		}
		
	}
}
