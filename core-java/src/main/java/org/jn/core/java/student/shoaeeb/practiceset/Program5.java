package org.jn.core.java.student.shoaeeb.practiceset;

import java.util.Scanner;

public class Program5 {
	//print prime number in range
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		boolean check=true;
		System.out.println("Enter the range");
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		
		for(int i=a; i<=b; i++)
		{
			if(i==1||i==0)
				continue;
			check=true;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j==0)
				{
					check=false;
					break;
				}
			}
			if(check)
			{
				System.out.println(i);
			}
			
		}
		
	}

}
