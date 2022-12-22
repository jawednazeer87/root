package org.jn.core.java.student.sadullah.weekly.assignment5;

public class CountOnes {
	static int countOnesInArray(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] argrs) {
		int a[] = {1,2,1,3,2,1,1,1};
		int countOfOnes = countOnesInArray(a);
		System.out.println("The count of zeros in the given array is: " +countOfOnes);
	}
}
