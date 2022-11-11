package org.jn.core.java.student.sadullah.weekly.assignment3;

public class NumDivisibleBy13And2 {

	public static void main(String[] args) {

		for (int i = 200; i >= 1; i--) {
			if (i % 13 == 0 || i % 2 == 0) {
				System.out.print(i +" ");
			}
		}
	}
}
