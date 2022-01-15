package org.la.core.java.student.moshin.assignment5;

public class Assignment50 {
	
	public static void main(String[] args) {

		int[] arr1 = {100, 30, -20, 0};
		int largestNum = arr1[0], smallestNum  = arr1[0];
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] > largestNum)
				largestNum = arr1[i];
			
			if(arr1[i] < smallestNum)
				smallestNum = arr1[i];			
		}
		System.out.println("Largest Number : "+largestNum);
		System.out.println("Smallest Number : "+smallestNum);
	}
}