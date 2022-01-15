package org.la.core.java.student.sajid.array.assignment5;

public class Wap40 {

	public static void main(String[] args) {
		// wap to add 5 to each element of an array
		
		int arr[] = {10, 19, 2, 7};
		int temp = 0;
		
		for(int i=0;i<arr.length;i++) {
			temp = arr[i]+5;
			arr[i] = temp;
		}
		
		//print values from the array
				for(int i=0;i<arr.length;i++) {
				System.out.println("arr["+i+"]: "+arr[i]);
				}	

	}

}
