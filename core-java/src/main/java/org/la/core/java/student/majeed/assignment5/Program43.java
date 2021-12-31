package org.la.core.java.student.majeed.assignment5;

public class Program43 {

	public static void main(String[] args) {
		/*43)	wap to multiply 3 to each element of an array
		Suppose given array is [10, 19, 2, 7] -> answer 30, 57, 6, 21
		 */
		
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = arr1[i]*3;		
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);	
		}		
	}
}