package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment6;

public class FindFactorial {

	public static void main(String[] args) {
		System.out.println("factorial of 7 is "+factorial(7));
	}
	
	static long factorial(int x) {
		int factorial = 1;
		while(x!=0) {
			factorial = factorial * x;
			x--;
		}
		return factorial;
	}

}
