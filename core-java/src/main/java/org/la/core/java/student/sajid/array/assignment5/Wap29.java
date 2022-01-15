package org.la.core.java.student.sajid.array.assignment5;

public class Wap29 {

	public static void main(String[] args) {
		// wap to insert an element (specific position) into an array?
		
		int [] arr1 = {2,4,6,8,10};
		int [] arr = new int[arr1.length+1];
		int idx = 3; //specific position
		int val = 5; //new value
		
		for (int i=0;i < arr1.length ; i++) {		
			System.out.println("arr1["+i+"]: "+arr1[i]);
		}						
				
		for(int i=0;i<arr.length;i++) {
			if(i<idx-1) {
				arr[i] = arr1[i];
			}else if(i==idx-1) {
				arr[i] = val;
			}else
				arr[i] = arr1[i-1];
			}	

		
		for (int i=0;i < arr.length ; i++) {		
				System.out.println("arr["+i+"]: "+ arr[i]);
		}

	}

}
