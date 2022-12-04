package org.jn.core.java.student.sadullah.weekly.assignment4;

import java.util.Iterator;

public class GreatestNumberInAnArray {

	public static void main(String[] args) {
		int a [] = {25, 78, 912, 1000, 638, 8, 0};
		int greatest = 0;
		int index = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (greatest<a[i]) {
				greatest = a[i];
				index = i;
			}
		}
		System.out.println("The greatest number in the array is: a[" +index +"] = " +greatest);
	}
}
