package org.la.core.java.jawed.method;


public class MethodUpperCaseArr {

	public static void main(String[] jhj) {
		char[] lowerCase = {'a', 'b', 'c'};
		char[] upperCase =convertToUpperCase(lowerCase);
		printArray(upperCase);
	}
	
	static char[] convertToUpperCase(char[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] -= 32;
		}
		return arr;
	}
	
	static void printArray(char arr[]) {
		for(char a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
}
