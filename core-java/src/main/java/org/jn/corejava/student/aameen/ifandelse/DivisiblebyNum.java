package org.jn.corejava.student.aameen.ifandelse;
import java.util.Scanner;

public class DivisiblebyNum {

	public static void main(String[] args) {
		// wap to find whether a number is divisible by a given number completely
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dividend value : ");
		int dividend =sc.nextInt();
		System.out.println("Enter the dividor value : ");
		int divisor = sc.nextInt();
		if(dividend%divisor==0)
			System.out.println("Yes , The given number is divisible by a number  completly ");
		else
			System.out.println("No , The given number is not divisible by a number completly");
	}

}
