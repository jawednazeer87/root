package org.la.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program67 {

	public static void main(String[] args) {
		// Wap to check whether a number is Prime number or not.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int i =2;
		for( ;i<num;i++)
		{
			if(num%i==0)
				break;
		}
		if(num==i)
			System.out.println(num+" is a prime number ");
		else
			System.out.println(num+" is not a prime number ");

	}

}
