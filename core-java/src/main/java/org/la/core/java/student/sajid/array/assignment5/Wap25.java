package org.la.core.java.student.sajid.array.assignment5;

public class Wap25 {

	public static void main(String[] args) {
		// wap to calculate the average value of array elements?
		
		int[] arr = {10,20,30,40,50};
		
		System.out.println("Average of all elements in the array is: ");
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];			
		}

		System.out.print(" "+sum/arr.length);
	}

}
