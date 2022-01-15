package org.la.core.java.student.sajid.array.assignment5;

public class Wap50 {

	public static void main(String[] args) {
		// wap to find the largest and smallest number in an integer array
		//Suppose given array is [100, 30, -20, 0] -> largest=100, smallest=-20
		
		int arr[] = {100, 30, -20, 0};
		int temp = arr[0];
		int temp1 = arr[0];
		
		
		System.out.print("Greatest number in the int array is: ");
		
		for(int i=0;i<arr.length;i++) {
			if (temp<arr[i] ) {
				temp = arr[i];
			}	
			
			if (temp1>arr[i] ) {
				temp1 = arr[i];
			}	
		}
		System.out.println(temp+" Smallest number in the int array is: "+temp1);

	}

}
