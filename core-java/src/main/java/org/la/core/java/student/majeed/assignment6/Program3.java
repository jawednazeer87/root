package org.la.core.java.student.majeed.assignment6;

public class Program3 {

	public static void main(String[] args) {
		/*
		void printEven(int[])
		method will print all even number from supplied array
		 */
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10}; 
		printEven(arr1);
	}
	
	static void printEven(int[] a) {
		for(int a1:a) {
			if(a1%2==0)
			System.out.println(a1);
		}
		
	}	

}