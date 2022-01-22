package org.la.core.java.student.sajid.method.assignment6;

public class Wap04 {

	public static void main(String[] args) {
		// 4) void printOdd(int[])
		// method will print all odd number from supplied array
		
		int arr[] = {1,-1,10,4,-5,6,8,7,9,21,23};
		
		System.out.print("Print all odd numbers from given array:");
		printEven(arr);
	}
		static void printEven (int arr []) {
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2!=0) {
					System.out.print(" " +arr[i]);
				}
			}			
		}	
}

