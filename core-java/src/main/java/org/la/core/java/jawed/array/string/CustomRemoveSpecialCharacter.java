package org.la.core.java.jawed.array.string;

/*
 * String each word of a string 
 * Note: any string without space is taken as a single string
 */

public class CustomRemoveSpecialCharacter {
	
	public static void main(String[] args) {
		
		String src = "Hello how are you";
		String reverseWords = reverseEachWord(src);
		System.out.println(reverseWords);
		
		
	}
	static String reverseEachWord(String src) {
		String array[] = src.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String str : array) {
			sb.append(reverse(str)).append(" ");
		}
		return String.valueOf(sb).trim();
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
