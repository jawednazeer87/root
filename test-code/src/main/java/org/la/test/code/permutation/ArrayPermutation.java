package org.la.test.code.permutation;

public class ArrayPermutation {

	private static int count = 1;
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		recursion(arr.length, arr);
		System.out.println("count: "+count);
	}
	
	public static  void recursion(int n, int[] arr) {
		if(n==1) {
			print(arr);
		}
		else {
			for(int i=0 ; i<n-1 ; i++) {
				recursion(n-1, arr);
				if(n%2==0) {
					swap(i, n-1, arr);
				}
				else {
					swap(0, n-1, arr);
				}
			}
			recursion(n-1, arr);
		}
	}
	
	public static void swap(int i, int j, int[] arr) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	
	public static void print(int[] arr) {
		for(Integer i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]);
			if(arr[i]%(i+1)==0) {
				count++;
			}
		}
		System.out.println("");
	}

}
