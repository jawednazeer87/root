package org.jn.core.java.Sahil;

public class a3 {
	static int printSumOfArray(int[] arr) {
		int sum=0;
		for(int x:arr) {
			sum += x;
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = {-1,2,3,1,34,-9};
		System.out.println("sum of array is "+ printSumOfArray(arr));
	}

}
