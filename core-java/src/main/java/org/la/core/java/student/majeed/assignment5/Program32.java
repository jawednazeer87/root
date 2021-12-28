package org.la.core.java.student.majeed.assignment5;

public class Program32 {

	public static void main(String[] args) {
		//32) wap to find the second largest element in an array?
		
		int[] arr1 = {1,2,3,4,5,6,7,17,16,14,12};
		int largestNum = 0, secondLargestNum = 0;
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i]>largestNum)
				largestNum = arr1[i];
			}	
		
		System.out.println("Largest Number is: "+largestNum);
		
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i]>secondLargestNum && arr1[i]<largestNum)
				secondLargestNum = arr1[i];
			}
		System.out.println("Second Largest Number is: "+secondLargestNum);
	}
}