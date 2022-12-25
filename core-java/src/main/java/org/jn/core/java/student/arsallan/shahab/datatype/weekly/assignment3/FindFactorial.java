package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment3;

public class FindFactorial {

	public static void main(String[] args) {
		int n = 7;
		int factorial = 1;
		for(int i=n; i>=1; i--) {
			factorial *= i;
		}
		System.out.println(factorial);
	}

}
