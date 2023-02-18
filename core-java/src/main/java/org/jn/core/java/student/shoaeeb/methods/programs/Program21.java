package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program21 {
	static boolean primeNum(int n)
	{
		boolean isPrime=true;
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				return isPrime;
			}
		}
		return isPrime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		if(primeNum(n))
		{
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+ " is not a prime number");
		}
	}

}
