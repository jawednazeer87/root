package org.jn.core.java.student.loop;

import java.util.Scanner;

public class Program64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		for(int num=1; num<=n; num++)
		{
			int count=0;
			for(int i=2; i<=num/2; i++)
			{
				if(num%i==0)
					count++;
			}
			break;
		}
		
		
		
		
		
		
		
	}

}
