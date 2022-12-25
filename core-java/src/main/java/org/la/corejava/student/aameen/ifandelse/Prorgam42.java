package org.la.corejava.student.aameen.ifandelse;
import java.util.Scanner;
public class Prorgam42 {

	public static void main(String[] args) {
		// wap to print ternary if number is 3 digit
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		int num = sc.nextInt();
		if(num>=100)
			System.out.println("Ternary ");
		else
			System.out.println("It is not a ternary ");

	}

}
