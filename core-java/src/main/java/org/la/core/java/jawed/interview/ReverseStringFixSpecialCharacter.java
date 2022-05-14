/**
 * 
 */
package org.la.core.java.jawed.interview;

/**
 * @author jawednazeer
 * Reverse a string except special character
 */
public class ReverseStringFixSpecialCharacter {
	
	public static void main(String[] args) {
		String src = "j2ASD@LKAfdl.kjpQ1 dsfj#";
		char arr[] = src.toCharArray();
		for(int i=0, j=src.length()-1 ; i<j ; i++, j--) {
			if(isAlphabet(src.charAt(i)) && isAlphabet(src.charAt(j))) {
				reverse(arr, i, j);
			}
		}
		System.out.println(arr);
	}
	
	static boolean isAlphabet(char c) {
		return (c>='A' && c<='Z') || (c>='a' && c<='z'); 
	}
	
	static void reverse(char a[], int i, int j) {
		char t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
