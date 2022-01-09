package org.la.core.java.student.majeed.assignment6;

public class Program1 {

	public static void main(String[] args) {
		/*
		void printNegative(int[])
		method will print all negative number from supplied array
		 */
		int[] arr1 = {-1,-2,-3,3,2,1,0}; 
		printNegative(arr1);
	}
	
	static void printNegative(int[] a) {
		for(int a1:a) {
			if(a1<0)
			System.out.println(a1);
		}
		
	}	

}