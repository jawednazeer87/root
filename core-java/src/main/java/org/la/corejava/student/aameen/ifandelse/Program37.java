package org.la.corejava.student.aameen.ifandelse;
import java.util.Scanner;

public class Program37 {

	public static void main(String[] args) {
		// wap to print whether number is divisible by 3 or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		int num = sc.nextInt();
		if(num%3==0)
			System.out.println("Is divisible by 3");
		else
			System.out.println("It is not divisible by 3");

	}

}
