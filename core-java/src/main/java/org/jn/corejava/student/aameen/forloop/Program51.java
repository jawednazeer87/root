package org.jn.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program51 {

	public static void main(String[] args) {
		// Wap to find sum of all natural numbers between 1 to n.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of the natural number to be printed : ");
		int n = sc.nextInt();
		int sum =0;
		for(int i = 1;i<=n;i++)
		{
			sum = sum +i;
			
		}
		System.out.println("The sum of  natural number is :  " +sum);
	}

}
