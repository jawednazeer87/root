package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program20 {
	//find the factorial of a number
	static int factorial(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fac=Program20.factorial(5);
		System.out.println(fac);
	}

}
