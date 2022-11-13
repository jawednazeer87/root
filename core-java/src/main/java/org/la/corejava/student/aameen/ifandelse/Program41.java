package org.la.corejava.student.aameen.ifandelse;
import java.util.Scanner;
public class Program41 {

	public static void main(String[] args) {
		// wap to print single if number is single digit
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		int num = sc.nextInt();
		if(num<10)
			System.out.println("Single ");
		else
			System.out.println("It is not a single digit ");
	}

}
