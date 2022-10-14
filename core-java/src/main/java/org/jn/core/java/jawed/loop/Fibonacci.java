package org.jn.core.java.jawed.loop;

public class Fibonacci {

	public static void main(String[] args) {

		int n = 20;

		int i = 1;
		int firstTerm = 0;
		int secondTerm = 1;
		while (i <= 5) {
			System.out.print(firstTerm + ", ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			i++;
		}
	}
}