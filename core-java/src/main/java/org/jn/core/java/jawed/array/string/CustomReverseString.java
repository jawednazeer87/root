package org.jn.core.java.jawed.array.string;

/*
 * String reverse program
 */

public class CustomReverseString {
	
	public static void main(String[] args) {
		
		String src = "world";
		String trgt = reverse(src);
		System.out.println(trgt);
	}
	
	static String reverse(String src) {
		char arr[] = src.toCharArray();
		int j = src.length()-1;
		for(int i=0 ; i<j ; i++, j--) {
			char c = arr[j];
			arr[j] = arr[i];
			arr[i] = c;
		}
		return String.valueOf(arr);
	}

}
