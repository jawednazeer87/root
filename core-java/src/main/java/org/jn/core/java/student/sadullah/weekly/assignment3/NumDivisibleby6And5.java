package org.jn.core.java.student.sadullah.weekly.assignment3;

public class NumDivisibleby6And5 {

	public static void main(String[] args) {

		for (int i = 30; i <= 80; i++) {
			if (i % 5 == 0 || i % 6 == 0) {
				System.out.print(i +" ");
			}
		}
	}
}
