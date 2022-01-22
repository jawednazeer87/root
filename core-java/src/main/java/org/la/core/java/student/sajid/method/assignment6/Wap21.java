package org.la.core.java.student.sajid.method.assignment6;

public class Wap21 {

	public static void main(String[] args) {
		// long factorial(int)
		//find factorial of given argument and return result
		
		int i=4;
		
		long l=factorial(i);
		System.out.println("Factorial of given number "+i+" is: "+l);

	}

	static long factorial(int a) {
		
		long res = 1;
		
		for(int i=1;i<=a;i++) {
			res = res * i;			
		}
		return res;
		
	}
}
