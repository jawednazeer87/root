package org.la.core.java.jawed.array.string;

/*
 * Find length of string with out using predefined length function 
 */
public class CustomStringLength {
	
	public static void main(String[] args) {
		String src = "Hello world";
		int length = getLength(src);
		System.out.println("Lenght: "+length);
	}
	
	static int getLength(String src) {
		char arr[] = src.toCharArray();
		int length = 0;
		for(char c : arr) {
			length++;
		}
		return length;
	}

}
