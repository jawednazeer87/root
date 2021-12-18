package org.la.core.java.student.tanseer.assignment3.conditional.statements;
import java.util.*;

public class Program12_UpperCaseLowerCase {

	public static void main(String[] args) 
	{ 
		char val ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to find upper or lower case : ");
		val = (char) sc.next().charAt(0);
		
		if ((val >= 65) && (val <= 90)) {
			System.out.println(" Entered Character is Upper case : " + val);
		} 
		
		else if((val >= 97) && (val <= 122)){
			System.out.println(" Entered Character is Lower case : " +val);
		}
		sc.close();
	}
		
}


