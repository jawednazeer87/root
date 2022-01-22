package org.la.core.java.student.sajid.array;

public class Q50 {
	public static void main(String[] args) {
		/*50)	wap to find the largest and smallest number in an integer array
		Suppose given array is [100, 30, -20, 0] -> largest=100, smallest=-20
		 */
		
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
