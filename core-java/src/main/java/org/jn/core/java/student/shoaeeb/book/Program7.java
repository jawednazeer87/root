package org.jn.core.java.student.shoaeeb.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Program7 {
	
	
	//operation on two numbers
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter two numbers: ");
		String numbers = br.readLine();
		StringTokenizer st = new StringTokenizer(numbers, " ");
		String num1  = st.nextToken();
		String num2 = st.nextToken();
		
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
		


		
	}

}
