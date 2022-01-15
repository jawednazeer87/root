package org.la.core.java.student.sajid.array.assignment5;

public class Wap28 {

	public static void main(String[] args) {
		// wap to remove a specific element from an array?
		
		int [] arr = {2,4,5,6,8,10};
		
		for (int i=0;i < arr.length ; i++) {		
			System.out.println("arr["+i+"]: "+arr[i]);
		}
		
		int [] arr1 = new int[arr.length-1];
		
		int j = 0;
		
		for(int i=0;i<arr.length;i++) {
			int rem = arr[i]%2;
			
			if(rem==0) {
				arr1[j++] = arr[i];
			}
		}
		
		for (int i=0;i < arr1.length ; i++) {		
				System.out.println("arr1["+i+"]: "+arr1[i]);
		}
	}

}
