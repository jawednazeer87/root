package org.la.corejava.student.aameen.ifandelse;
import java.util.Scanner;
public class Program35 {

	public static void main(String[] args) {
		// wap to print odd if number is odd and even if number is even
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		int num = sc.nextInt();
		if(num%2==0)
			System.out.println("Even");
		else 
			System.out.println("Odd");
		

	}

}
