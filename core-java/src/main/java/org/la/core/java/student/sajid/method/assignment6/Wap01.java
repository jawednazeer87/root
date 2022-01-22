package org.la.core.java.student.sajid.method.assignment6;

public class Wap01 {

	public static void main(String[] args) {
		// 1) void printNegative(int[])
		// method will print all negative number from supplied array
		
		int arr[] = {1,-1,0,4,-5};
		
		System.out.print("Print all negative numbers from given array:");
		printNegative(arr);
	}
		static void printNegative (int arr []) {
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<0) {
					System.out.print(" " +arr[i]);
				}
			}			
		}	
}
