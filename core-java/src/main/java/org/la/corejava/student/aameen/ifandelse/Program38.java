package org.la.corejava.student.aameen.ifandelse;
import java.util.Scanner;
public class Program38 {

	public static void main(String[] args) {
		// wap to check whether number divisible by 7
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value ");
		int num = sc.nextInt();
		if(num%7==0)
			System.out.println("It is divisible by 7");
		else
			System.out.println("It is not divisible by 7");
	}

}
