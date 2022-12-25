package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ArrayCopySameMemory {

	public static void main(String[] args) {
		int a [] = {1, 10, 20, 40, 60};
	
		int b [] = a;
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("a[" +i + "] = " +a[i]);
		}
	}
}
