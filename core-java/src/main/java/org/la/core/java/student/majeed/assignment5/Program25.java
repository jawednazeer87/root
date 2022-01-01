package org.la.core.java.student.majeed.assignment5;

public class Program25 {

	public static void main(String[] args) {
		//25) wap to calculate the average value of array elements?
		
		int[] arr1 = {1,2,3,4,5,6,7,7,6,6,4,2,2};
		int sum = 0;
		for(int i=0; i<arr1.length;i++) {
			sum += arr1[i];
			}
			
			System.out.println(sum/arr1.length);
	}
}
