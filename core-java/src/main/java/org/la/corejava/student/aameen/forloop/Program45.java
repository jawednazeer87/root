package org.la.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program45 {

	public static void main(String[] args) {
		// Wap to print all natural numbers from 1 to n.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of natural number to be printed ");
		int n =sc.nextInt();
		System.out.println("The natural number are : ");

		for(int i = 1;i<=n;i++)
		{
			System.out.println(i);
		}
	}

}
