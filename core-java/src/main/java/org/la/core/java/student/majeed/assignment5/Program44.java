package org.la.core.java.student.majeed.assignment5;

public class Program44 {

	public static void main(String[] args) {
		/*44)	wap to to divide each element of an array by 2.
		Suppose given array is [10, 19, 2, 7] -> our program will divide each element by 2
		then answer should be 10/2, 19/2, 2, 7/2 = 5, 9, 3, 1
		 */
		
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = arr1[i]/2;		
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);	
		}		
	}
}