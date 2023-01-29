package org.jn.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program69 {

	public static void main(String[] args) {
		// Wap to find sum of all prime numbers between 1 to n.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num =sc.nextInt();
		int sum = 1;
		 System.out.println("The sum of all the prime number between 1 to "+num);
		for(int i = 1;i<=num;i++)
		{
			boolean isPrime=true;
			for(int n = 2;n<i;n++)
			{
				if(i%n==0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime == true )
			{
				System.out.println(i);
				sum = sum+i;
			}
		}
		System.out.println("The sum of all the prime number between 1 to "+num + " is : "+sum);

	}

}
