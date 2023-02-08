package org.jn.core.java.student.shoaeeeb.input.output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int a;
		int b;
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter two number");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		int sum=a+b;
		System.out.printf("Sum=%d",sum);
	}

}
