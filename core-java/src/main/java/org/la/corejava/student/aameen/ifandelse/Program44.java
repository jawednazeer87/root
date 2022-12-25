package org.la.corejava.student.aameen.ifandelse;
import java.util.Scanner;
public class Program44 {

	public static void main(String[] args) {
		// wap to print kid if age<13, print teenage if age<18 and age>12, and adult if age>18
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value ");
		int age = sc.nextInt();
		
		if((age<18)&&(age>=12))
			System.out.println("Teenage ");
		else if(age>18)
			System.out.println("Adult");
		else 
			System.out.println("Kid");
			
	}

}
