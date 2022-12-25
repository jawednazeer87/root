package org.jn.core.java.student.sadullah.weekly.assignment5;

public class OddNumberFromArray {
	static void printOdd(int a[]) {
	for (int i = 0; i < a.length; i++) {
		if (a[i] % 2 != 0) {
			System.out.println("a[" +i +"] = " +a[i]);
		}
	}
}

public static void main(String[] argrs) {
	int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	printOdd(arr);
}
}
