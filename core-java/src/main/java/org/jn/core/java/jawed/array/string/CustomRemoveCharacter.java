package org.jn.core.java.jawed.array.string;

/*
 * Remove specific character
 */

public class CustomRemoveCharacter {
	
	public static void main(String[] args) {
		String src = "3Hello# how2 are yo?u 4334";
		char ch = 'h';
		String reverseWords = removeSpecialCharacter(src, ch);
		System.out.println(reverseWords);
	}
		
	static String removeSpecialCharacter(String src, char ch) {
		char arr[] = src.toCharArray();
		int length = src.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<length ; i++) {
			if(arr[i]!=ch) {
				sb.append(arr[i]);
			}
		}
		return String.valueOf(sb);
	}

}
