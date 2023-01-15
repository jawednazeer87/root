package org.jn.core.java.student.shoaeeb.practiceset;


//fibonacci series using recursion


public class Program6 {
	public static int fib(int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(9));
	}

}
