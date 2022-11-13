package org.jn.core.java.student.sadullah.weekly.assignment3;

public class UpperCaseAlphabetExcludingVowels {

	public static void main(String[] args) {
		
		System.out.println("Upper case alphabets withet vowels");
		
		for (int i = 65; i < 91; i++) {
			if(i != 65 && i != 69 && i != 73 && 1 != 79 && i != 85) {
				System.out.print((char) i +" ");
			}
		}
	}
}
