package org.la.core.java.student.sajid.array.assignment5;

public class Wap26 {

	public static void main(String[] args) {
		// wap to test if an array contains a specific value?
		
		int[] arr = {22,33,44,93,55};
		int a = 93;
		boolean found = false;
		
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==a) {
				found = true;
			}
		}
		
		if(found) {
			System.out.println("array contains "+a);
		}
		

	}

}
