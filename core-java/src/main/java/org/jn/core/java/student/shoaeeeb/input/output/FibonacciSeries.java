package org.jn.core.java.student.shoaeeeb.input.output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSeries {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		int n=Integer.parseInt(br.readLine());
		int a=0;
		int b=1;
		int c=1;
		int i=2;
		System.out.print(a+" "+b+"");
		while(i<n)
		{
			a=b;
			b=c;
			
			c=a+b;
			System.out.print(" "+c);
			i++;
			
		}
	}

}
