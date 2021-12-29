package org.la.core.java.student.mdfarman.array.assignment5;


public class Question25 {
	//	25) wap to calculate the average value of array elements?

	public static void main(String[] args) {

		int arr[] = {8,4,5,7,6,5,4,9,8,5,2,4,5,8,4,5,2};
		int len = arr.length;
		float sum = 0 ; 
		float avg = 0;
		
		for(int i = 0 ; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum/len;
		System.out.println(avg);
				
		
		
	}
}
