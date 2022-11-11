package org.jn.core.java.student.sadullah.weekly.assignment3;

public class DivisibleBy2And3 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0 || i % 2 == 0) {
				System.out.print(i +" ");
			}
		}
	}
}
