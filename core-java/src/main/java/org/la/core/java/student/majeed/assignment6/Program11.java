package org.la.core.java.student.majeed.assignment6;

public class Program11 {
	
	static int[] arr1 = new int[] {6,7,8,9,10,1,2,3,4,5}; 
	
	public static void main(String[] args) {		
		/*
		int smallest(int[])
		find smallest element of an array and return that smallest value
		 */
		
		smallest(arr1);
	}
	static int smallestNum = arr1[0];
	static void smallest(int[] a) {		
		for(int a1:a) {
			if(smallestNum > a1)
				smallestNum=a1;
		}
		System.out.println(smallestNum);
	}	

}