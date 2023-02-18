package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program22 {
	//print the fibonacci series
	static void fib(int n)
	{
		int a=0,b=1;
		int c;
		System.out.println(a+" "+b);
		while(n>=3)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			n--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program22.fib(10);
	}

}
