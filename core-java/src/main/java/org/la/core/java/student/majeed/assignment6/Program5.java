package org.la.core.java.student.majeed.assignment6;

public class Program5 {

	public static void main(String[] args) {
		/*
		void printNum(int[], int)
		method will print number if found in array negative number from supplied array
		 */
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10}; 
		printNum(arr1,11);
	}
	
	
	static void printNum(int[] a, int b) {
		boolean arrValue = false;
		for(int a1:a) {
			if(a1==b)
				arrValue = true;
			
		}
		if(arrValue==true) {
			System.out.println(b+" is found in the array");
		} else {
			System.out.println(b+" is not found in the array");
		}
		
	}
}