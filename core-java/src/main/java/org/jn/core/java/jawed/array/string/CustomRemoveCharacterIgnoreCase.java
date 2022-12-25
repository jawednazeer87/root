package org.jn.core.java.jawed.array.string;

/*
 * Remove specific character ignore case
 */

public class CustomRemoveCharacterIgnoreCase {
	
	public static void main(String[] args) {
		String src = "3Hello# how2 are yo?u 4334";
		char ch = '3';
		String reverseWords = removeSpecialCharacter(src, ch);
		System.out.println(reverseWords);
	}
		
	static String removeSpecialCharacter(String src, char ch) {
		char ch2 = ' ';
		boolean alphabet = false;
		if((ch>='a' && ch<='z')) {
			ch2 = (char)(ch-32);
			alphabet = true;
		}
		else if(ch>='A' && ch<='Z') {
			ch2 = (char)(ch+32);
			alphabet = true;
		}
		char arr[] = src.toCharArray();
		int length = src.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<length ; i++) {
			if(alphabet) {
				if(!(arr[i]==ch || arr[i]==ch2)) {
					sb.append(arr[i]);
				}
			}
			else {
				if(arr[i]!=ch) {
					sb.append(arr[i]);
				}
			}
		}
		return String.valueOf(sb);
	}

}
