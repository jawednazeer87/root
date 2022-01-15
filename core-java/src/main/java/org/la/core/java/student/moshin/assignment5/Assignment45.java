package org.la.core.java.student.moshin.assignment5;

public class Assignment45 {
	
	public static void main(String[] args) {

		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int sum=0; 
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2 == 0)
				sum += arr1[i];
		}
			System.out.println(sum);	
				
	}
}