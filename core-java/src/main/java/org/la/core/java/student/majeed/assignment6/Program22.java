package org.la.core.java.student.majeed.assignment6;

public class Program22 {

	public static void main(String[] args) {
		/*
		long factorial(int)
		find factorial of given argument and return result
		 */
		long c = factorial(5);
		System.out.println(c);
	}
	
	static long factorial(int a) {
		long k = 1;
		for(int i=a;i>0;i--) {
		k = k*i;
		}
		return k;
	}	

}