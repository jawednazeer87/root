package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question75 {

	//	75.	Wap to print Fibonacci series up to n terms.



	public static void main(String[] args) {

		int n = 10; 
		int firstTerm = 0; 
		int secondTerm = 1;

		for (int i = 1; i <= n; ++i) {
			System.out.print(firstTerm + ", ");

			// compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}