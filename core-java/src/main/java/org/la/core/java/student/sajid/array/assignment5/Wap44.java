package org.la.core.java.student.sajid.array.assignment5;

public class Wap44 {

	public static void main(String[] args) {
		// wap to to divide each element of an array by 2.
		//Suppose given array is [10, 19, 2, 7] -> our program will divide each element by 2
		//then answer should be 10/2, 19/2, 2, 7/2 = 5, 9, 3, 1
		
		int arr[] = {10, 19, 2, 7};
		int temp = 0;
		
		for(int i=0;i<arr.length;i++) {
			temp = arr[i]/2;
			arr[i] = temp;
		}
		
		//print values from the array
				for(int i=0;i<arr.length;i++) {
				System.out.println("arr["+i+"]: "+arr[i]);
				}	

	}

}
