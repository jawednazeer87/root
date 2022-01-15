package org.la.core.java.student.sajid.array.assignment5;

public class wap27 {

	public static void main(String[] args) {
		// wap to find the index of an array element
		
		int[] arr = {33,55,66,10,88};
		int a = 10;
		int idx = 0;
		

		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				idx=i;
			}			
		}
		System.out.println("Index of the array for value "+a+" is: "+idx);
	}

}
