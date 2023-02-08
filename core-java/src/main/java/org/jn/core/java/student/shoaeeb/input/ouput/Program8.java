package org.jn.core.java.student.shoaeeb.input.ouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Program8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s,s1,s2;
		int num,num1;
		System.out.println("Enter number,number2: ");
		s=br.readLine();
		StringTokenizer st = new StringTokenizer(s,",");
		s1=st.nextToken();
		s2=st.nextToken();
		s1.trim();
		s2.trim();
		
		num=Integer.parseInt(s1);
		num1=Integer.parseInt(s2);
		
		System.out.println("Addition: "+(num+num1));
		System.out.println("Subtraction: "+(num-num1));
		System.out.println("Multiplication: "+(num*num1));
		System.out.println("Division: "+(num/num1));
	}

}
