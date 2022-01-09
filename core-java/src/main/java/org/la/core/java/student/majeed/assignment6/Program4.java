package org.la.core.java.student.majeed.assignment6;

public class Program4 {

	public static void main(String[] args) {
		/*
		void printOdd(int[])
		method will print all odd number from supplied array
		 */
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10}; 
		printOdd(arr1);
	}
	
	static void printOdd(int[] a) {
		for(int a1:a) {
			if(a1%2!=0)
			System.out.println(a1);
		}
		
	}	

}