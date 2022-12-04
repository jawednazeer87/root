package org.jn.core.java.jawed.array.string;

/*
 * Remove all special character from a string except space
 */

public class CustomRemoveSpecialCharacterExceptSpace {
	
	public static void main(String[] args) {
		String src = "3Hello# how2 are yo?u 4334";
		String reverseWords = removeSpecialCharacter(src);
		System.out.println(reverseWords);
	}
		
	static String removeSpecialCharacter(String src) {
		char arr[] = src.toCharArray();
		int length = src.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<length ; i++) {
			if((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z') || arr[i]==' ') {
				sb.append(arr[i]);
			}
		}
		return String.valueOf(sb);
	}

}
