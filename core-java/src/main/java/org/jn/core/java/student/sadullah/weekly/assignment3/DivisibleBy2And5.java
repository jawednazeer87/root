package org.jn.core.java.student.sadullah.weekly.assignment3;

public class DivisibleBy2And5 {

	public static void main(String[] args) {
		
		for (int i = 10; i <= 50; i++) {
			if (i % 2 == 0 || i % 5 == 0) {
				System.out.print(i +" ");
			}
		}
	}
}
