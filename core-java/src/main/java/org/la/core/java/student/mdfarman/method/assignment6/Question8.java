package org.la.core.java.student.mdfarman.method.assignment6;


public class Question8 {

	//		int sum(int[])
//	find sum of all elements of an array and return sum

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int sum= sumOfArray(arr);
		System.out.println(sum);
	}
	public static int sumOfArray(int[] arr) {
		int total = 0;
		for(int i:arr) {
			total += i;
		}
		return total;
	}

}
