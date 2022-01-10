package org.la.core.java.jawed.array.string;

/*
 * String reverse program
 */

public class Palindrome {
	
	public static void main(String[] args) {
		
		String src = "Noon";
		String trgt = reverse(src);
		if(src.equalsIgnoreCase(trgt)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
	
	static String reverse(String src) {
		char[] arr = src.toCharArray();
		int j = src.length()-1;
		for(int i=0 ; i<j ; i++, j--) {
			char c = arr[j];
			arr[j] = arr[i];
			arr[i] = c;
		}
		return String.valueOf(arr);
	}

}
