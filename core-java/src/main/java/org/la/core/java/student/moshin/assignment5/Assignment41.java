package org.la.core.java.student.moshin.assignment5;

public class Assignment41 {
	
	public static void main(String[] args) {

		char[] arr1 = {'a', 'b', 'c'};
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i] -= 32;		
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);	
		}		
	}
}