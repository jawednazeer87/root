package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ReverseAnArray {

	public static void main(String[] args) {
		int a [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int len = a.length;
		for (int i = 0, j = len-1; i < j; i++, j--) {
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		for(int z : a) {
			System.out.println(z);
		}
	}
}
