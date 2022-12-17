package org.jn.core.java.student.sadullah.weekly.assignment5;

public class CountZeros {
	static int countZeros(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] argrs) {
		int a[] = {1,0,1,0,0,1,1,0};
		int countOfZeros = countZeros(a);
		System.out.println("The count of zeros in the given array is: " +countOfZeros);
	}
}
