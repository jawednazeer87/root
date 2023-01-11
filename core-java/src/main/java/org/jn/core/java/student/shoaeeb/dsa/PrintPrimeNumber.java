package org.jn.core.java.student.shoaeeb.dsa;
import java.util.Scanner;
public class PrintPrimeNumber {

	public static boolean isPrime(int n)
	{
		if(n==0 || n==1)
			return false;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i+" ");
			}
		}
		
	}

}
