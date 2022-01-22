package org.la.core.java.student.sajid.method.assignment6;

public class Wap02 {

	public static void main(String[] args) {
		// 2) void printPositive(int[])
		// method will print all Positive number from supplied array
		
		int arr[] = {1,-1,0,4,-5};
		
		System.out.print("Print all Positive numbers from given array:");
		printPositive(arr);
	}
		static void printPositive (int arr []) {
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>=0) {
					System.out.print(" " +arr[i]);
				}
			}			
		}	
}
