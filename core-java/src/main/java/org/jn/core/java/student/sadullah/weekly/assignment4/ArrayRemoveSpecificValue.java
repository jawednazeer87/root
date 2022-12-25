package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ArrayRemoveSpecificValue {
	public static void main(String[] argrs) {
		int a [] = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
		
		int removeElement = 3;
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == removeElement) {
				count++;
			}
		}
		int b [] = new int[a.length-count];
		
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != removeElement) {
				b[j] = a[i];
				j++;
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" +i +"] = " +b[i]);
		}
	}
}
