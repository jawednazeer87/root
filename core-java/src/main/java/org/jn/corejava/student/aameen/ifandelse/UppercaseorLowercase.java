package org.jn.corejava.student.aameen.ifandelse;
import java.util.Scanner;
public class UppercaseorLowercase {

	public static void main(String[] args) {
		// Write a program to check whether a given character is lowercase ( a to z ) or uppercase ( A to Z ).
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character ");
		char a =  sc.next().charAt(0) ;	
		
		if(a >= 'A' && a <= 'Z')
			System.out.println("Uppercase ");
		else if(a >= 'a' && a <= 'z')
			System.out.println("Lowercase");
		else
			System.out.println("It is not a character ");
			
		
	}

}
