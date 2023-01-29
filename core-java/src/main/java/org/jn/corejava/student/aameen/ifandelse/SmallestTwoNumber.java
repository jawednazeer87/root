package org.jn.corejava.student.aameen.ifandelse;
import java.util.Scanner;
public class SmallestTwoNumber {

	public static void main(String[] args) {
		// 11.	wap to find smallest number among 2 numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of first number ");
		int num1=sc.nextInt() ;
		System.out.println("Enter the value of Second number ");
		int num2 = sc.nextInt();
		if(num1<num2)
			System.out.println(" the smaller number among two is num1 : "+num1);
		else
			System.out.println(" the smaller number among two is num2 : "+num2);
		System.out.println("");
		

	}
	
}
