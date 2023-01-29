package org.jn.corejava.student.aameen.ternary;
import java.util.Scanner;
public class Negativenumber {

	public static void main(String[] args) {
		// wap to print negative number among two given numbers( with if and without if)
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 =sc.nextInt();
		int negativenum2 = (num2<0)?num2:num1;
		System.out.println("Negative number among two number is : "+negativenum2);

	
	
	if(num1<0)
	{
		System.out.println("Negative number between two number is : "+num1);
	}
	else
		System.out.println("Negative number between two number is :"+num2);
	}
}
