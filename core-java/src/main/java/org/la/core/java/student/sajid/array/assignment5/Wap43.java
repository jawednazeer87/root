package org.la.core.java.student.sajid.array.assignment5;

public class Wap43 {

	public static void main(String[] args) {
		// wap to multiply 3 to each element of an array
		// Suppose given array is [10, 19, 2, 7] -> answer 30, 57, 6, 21
		
		int arr[] = {10, 19, 2, 7};
		int temp = 0;
		
		for(int i=0;i<arr.length;i++) {
			temp = arr[i]*3;
			arr[i] = temp;
		}
		
		//print values from the array
				for(int i=0;i<arr.length;i++) {
				System.out.println("arr["+i+"]: "+arr[i]);
				}	

	}

}
