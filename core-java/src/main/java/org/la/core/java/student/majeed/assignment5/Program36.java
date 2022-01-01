package org.la.core.java.student.majeed.assignment5;

public class Program36 {

	public static void main(String[] args) {
		/*36) wap to remove the duplicate elements of a given array and return the new length of the 
		array.Sample array: [20, 20, 30, 40, 50, 50, 50]
		After removing the duplicate elements the program should return 4 as the new length of the array?
		*/
		
		int[] arr1 = {20, 20, 30, 40, 50, 50, 50};
		int arrayLength = arr1.length;
		for(int i=0; i<arr1.length;i++) {
			for(int n=i+1; n<arrayLength;n++) {
				if(arr1[i] == arr1[n]) {
					arr1[n] = arr1[arrayLength-1];
					arrayLength--;
					n--;
				} 
			}	
		}
		for(int i=0; i<arrayLength;i++) {
			System.out.println(arr1[i]);
		}
		
	}
}