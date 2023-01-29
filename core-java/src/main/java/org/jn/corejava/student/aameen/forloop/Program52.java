package org.jn.corejava.student.aameen.forloop;
import java.util.Scanner;
public class Program52 {

	public static void main(String[] args) {
		// Wap to find sum of all even numbers between 1 to n.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of natural number : ");
		int n = sc.nextInt();
		int sum=0;
		for(int i = 1; i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("The sum of all even natural number between 1 to "+n+ " : " +sum);
		
	}

}
