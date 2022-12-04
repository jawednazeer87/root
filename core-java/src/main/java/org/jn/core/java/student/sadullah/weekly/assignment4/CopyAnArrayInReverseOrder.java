package org.jn.core.java.student.sadullah.weekly.assignment4;

import java.util.Iterator;

public class CopyAnArrayInReverseOrder {

	public static void main(String[] args) {
		int a [] = {1, 2, 3};
		int b [] = new int [a.length];
		
		for (int i = 0; i < b.length; i++) {
			b[i] = a[a.length-1-i];
		}
		
		System.out.println("Main Array:");
		for (int i = 0; i < b.length; i++) {
			System.out.println("a[" +i + "] = " +a[i]);
		}
		
		System.out.println("Reverse copy array:");
		for (int i = 0; i < b.length; i++) {
			System.out.println("a[" +i + "] = " +b[i]);
		}
	}
}
