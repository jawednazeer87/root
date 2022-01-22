package org.la.core.java.student.sajid.method.assignment6;

public class Wap03 {

	public static void main(String[] args) {
		//3) void printEven(int[])
		//method will print all even number from supplied array
		
		int arr[] = {1,-2,10,4,-5,6,8,7};
		
		System.out.print("Print all even numbers from given array:");
		printEven(arr);
	}
		static void printEven (int arr []) {
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					System.out.print(" " +arr[i]);
				}
			}			
		}	
}