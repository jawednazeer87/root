package org.jn.core.java.student.shoaeeb.string.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 {
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		System.out.println("Enter a word");
		s=br.readLine();
		String temp=s;
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		s=sb.toString();
		System.out.println(sb);
		if(s.equals(temp))
		{
			System.out.println(s+" is a palindrome");
		}
		else {
			System.out.println(s+" is not a palindrome");
		}
		
	}

}
