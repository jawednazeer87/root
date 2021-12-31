package org.la.core.java.student.mdfarman.array.assignment5;


public class Question27 {
	//	27) wap to find the index of an array element(here u have to take any number and check that number is 
//		present inside an array or not, 
//   	 if 	not print -1, if present then print its index means of of that element)?


	public static void main(String[] args) {

		int arr[] = {8,4,5,7,6,5,4,9,8,5,2,4,5,8,4,5,2};
		int  specificValue = 7;
		
		for(int i = 0 ; i <  arr.length; i++) {
			if(arr[i] == specificValue) { 
				System.out.println(specificValue+" Present at Index : "+i );
				
			}
		}
		
	}
}
