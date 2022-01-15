package org.la.core.java.student.majeed.assignment5;

public class Program40 {

	public static void main(String[] args) {
		//40)	wap to add 5 to each element of an array
		
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
				
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = arr1[i]+5;		
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);	
		}		
	}
}