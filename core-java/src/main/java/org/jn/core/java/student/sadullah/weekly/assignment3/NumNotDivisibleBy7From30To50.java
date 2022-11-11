package org.jn.core.java.student.sadullah.weekly.assignment3;

import java.util.Iterator;

public class NumNotDivisibleBy7From30To50 {

	public static void main(String[] args) {

		for (int i = 30; i <= 50; i++) {
			if (i % 7 != 0) {
				System.out.print(i +" ");
			}
		}
	}
}
