package org.jn.core.java.student.sadullah.weekly.assignment5;

import java.util.Iterator;

public class AddTwoArraysFormThirdArray {
	static int [] copyArrays(int a [], int b []) {
		int c [] = new int [a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			c[i+a.length] = b[i]; 
		}
		
		return c;
	}
	
	
	public static void main(String[] argrs) {
		int a [] = {-9999, 100, 12,739, -12, -93, -3, 0, 61722, 1273};
		int b [] = {12, 34, 65, 90, 345, 1209, 2222, 456, 2000, 56};
		
		int c [] = copyArrays(a, b);
		
		for (int i = 0; i < c.length; i++) {
			System.out.println("c [" +i +"] = " +c[i]);
		}
	}
}
