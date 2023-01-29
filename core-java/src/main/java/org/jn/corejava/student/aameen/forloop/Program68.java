package org.jn.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program68 {

	public static void main(String[] args) {
		// Wap to print all Prime numbers between 1 to n
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		
		System.out.println("Prime number from 1 to "+num);
		for(int i = 2;i<=num;i++)
		{
			boolean isPrime = true;
			for(int n = 2;n<i;n++)
			{
				if(i%n==0)
				{
					isPrime=false;
					break ;
				}
			}
			if(isPrime==true)
			{
				System.out.println(i);
			}
		}
		
	}

}
