package org.jn.core.java.student.sadullah.weekly.assignment3;

public class OddNumFrom120To100 {

	public static void main(String[] args) {

		for (int i = 120; i >= 100; i--) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
