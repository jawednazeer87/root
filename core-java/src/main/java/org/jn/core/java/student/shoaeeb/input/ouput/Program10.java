package org.jn.core.java.student.shoaeeb.input.ouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program10 {
	//fibonacci series
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=0;
		int b=1;
		int c=1;
		System.out.println("Enter number: ");
		int n=Integer.parseInt(br.readLine());
		System.out.println(a);
		System.out.println(b);
		int count=3;
		while(count<=n)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;

			count++;
			
		}
		
	}

}
