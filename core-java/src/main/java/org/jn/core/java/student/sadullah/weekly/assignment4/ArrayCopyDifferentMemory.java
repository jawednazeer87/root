package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ArrayCopyDifferentMemory {

	public static void main(String[] args) {
		int a [] = {23, 40, 78, 902, 1000, -24, 0, -26};
		
		int b [] = new int [a.length];
		
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" +i +"] = " +b[i]);
		}
		
		System.out.println("Memory address of array a: " +a);
		System.out.println("Memory address of array b: " +b);

	}
}
