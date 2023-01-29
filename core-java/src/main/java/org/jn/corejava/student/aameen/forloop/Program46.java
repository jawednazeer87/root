package org.jn.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program46 {

	public static void main(String[] args) {
		// Wap to print all natural numbers in reverse (from n to 1).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of natural number : ");
		int n =sc.nextInt();
		System.out.println("The natural number is reverse order are : ");
		for(int i = n;i>=1;i--)
		{
			System.out.println(i);
		}

	}

}
