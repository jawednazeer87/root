package org.jn.corejava.student.aameen.ifandelse;
import java.util.Scanner;
public class Prorgam43 {

	public static void main(String[] args) {
		// wap to print 100 if number is between 100 to 200
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		int num = sc.nextInt();
		
		if((num>=100)&&(num<=200))
			System.out.println("100");
		else
			System.out.println("It is not in between 100 to 200");

	}

}
