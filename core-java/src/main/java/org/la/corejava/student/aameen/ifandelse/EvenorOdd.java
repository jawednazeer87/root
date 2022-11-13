package org.la.corejava.student.aameen.ifandelse;
import java.util.Scanner;
public class EvenorOdd {

	public static void main(String[] args) {
		// wap to find a number is odd or even
		int num ;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of the number : ");
		num=sc.nextInt();
		if(num%2==0)
			System.out.println("Even Number ");
		else
			System.out.println("Odd number ");

	}

}
