package org.la.core.java.student.sajid.array.assignment5;

public class Wap41 {

	public static void main(String[] args) {
		// wap to convert an array of characters from upper case to lower case, 
		//e.g if arr[] = {'a', 'b', 'C'} 
		//then after conversion final array should be arr[] = {'A', 'B', 'C'}
		
		char arr[] = {'a', 'b', 'c'};
		int j = 0;
		
		
		for(int i=0;i<arr.length;i++) {
			 j = arr[i]-32;
			arr[i] = (char)j;
		}
		
		//print values from the array
				for(int i=0;i<arr.length;i++) {
				System.out.println("arr["+i+"]: "+arr[i]);
				}	


	}

}
