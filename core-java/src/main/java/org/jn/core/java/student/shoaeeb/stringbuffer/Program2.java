package org.jn.core.java.student.shoaeeb.stringbuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 {
	//a string is palindrome or not
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string ");
		String str = br.readLine();
		String temp = str;
		StringBuffer sb  = new StringBuffer(str);
		//reverse the string
		sb.reverse();
		str = sb.toString();
		
		
		if(temp.equals(str))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}

	}

}
