package org.jn.core.java.student.sadullah.weekly.assignment3;

public class LowerCaseAlphabetsExcludingVowels {

	public static void main(String[] args) {

		System.out.println("Lower case alphabets withet vowels");
		
		for (int i = 97; i < 123; i++) {
			if(i != 97 && i != 101 && i != 105 && 1 != 111 && i != 117) {
				System.out.print((char) i +" ");
			}
		}
	}
}
