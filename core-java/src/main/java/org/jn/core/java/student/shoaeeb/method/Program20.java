package org.jn.core.java.student.shoaeeb.method;

public class Program20 {

	static long factorial(int n)
	{
		if(n==0 || n==1)
			return 1;
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}

}
