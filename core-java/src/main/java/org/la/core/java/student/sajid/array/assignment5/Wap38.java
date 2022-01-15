package org.la.core.java.student.sajid.array.assignment5;

public class Wap38 {

	public static void main(String[] args) {
		// Find largest and smallest elements of an array? 
		
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
