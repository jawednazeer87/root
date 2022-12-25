package org.la.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program37 {

	public static void main(String[] args) {
		// wap to find factorial of a given number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num =sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		fact=fact*i;
		
		System.out.println("factorial of a given number  "+num+" : "+fact);
		

	}

}
