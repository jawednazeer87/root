package org.la.core.java.student.majeed.assignment6;

public class Program2 {

	public static void main(String[] args) {
		/*
		void printPositive(int[])
		method will print all positive number from supplied array
		 */
		int[] arr1 = {-1,-2,-3,3,2,1,0}; 
		printPositive(arr1);
	}
	
	static void printPositive(int[] a) {
		for(int a1:a) {
			if(a1>0)
			System.out.println(a1);
		}
		
	}	

}