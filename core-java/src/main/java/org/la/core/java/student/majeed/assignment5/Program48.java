package org.la.core.java.student.majeed.assignment5;

public class Program48 {

	public static void main(String[] args) {
		/*48)	wap to count all 2's of an int array
		Suppose given array is [10, 19, 2, 7] -> number of 2's here one
		Suppose given array is [1, 19, 1, 7, 1, 3] -> number of 2's here 0
		 */
		
		int[] arr1 = {10, 19, 2, 7};
		int count=0; 
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] == 2)
				count += 1;
		}
			System.out.println(count);	
				
	}
}