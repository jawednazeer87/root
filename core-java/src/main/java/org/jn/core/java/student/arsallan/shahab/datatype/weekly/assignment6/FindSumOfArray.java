package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment6;

public class FindSumOfArray {

	static int sumOfArray(int[] arr) {
		int sum =0;
		for(int x:arr) {
			sum += x;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.println("sum of array is: "+sumOfArray(arr));
	}

}
