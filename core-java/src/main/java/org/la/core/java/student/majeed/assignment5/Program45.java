package org.la.core.java.student.majeed.assignment5;

public class Program45 {

	public static void main(String[] args) {
		/*45) wap to add all even numbers of an array and print the sum
		Suppose given array is [10, 19, 2, 7] -> sum=12 which is sum of 10 and 2, both are even
		 */
		
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int sum=0; 
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2 == 0)
				sum += arr1[i];
		}
			System.out.println(sum);	
				
	}
}