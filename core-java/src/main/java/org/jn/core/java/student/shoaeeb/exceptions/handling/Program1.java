package org.jn.core.java.student.shoaeeb.exceptions.handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter a number");
			int n=Integer.parseInt(br.readLine());
			int a=45/n;
			System.out.println(a);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divison by zero not possible");
		}
	}

}
