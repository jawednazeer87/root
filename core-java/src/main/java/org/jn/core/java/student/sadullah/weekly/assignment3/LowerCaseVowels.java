package org.jn.core.java.student.sadullah.weekly.assignment3;

public class LowerCaseVowels {

	public static void main(String[] args) {
		
		System.out.println("All lower case vowels");
	
		for (char i = 'a'; i <= 'z'; i++) {
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
				System.out.print(i +" ");
			}
		}
	}
}
