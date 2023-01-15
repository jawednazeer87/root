package org.jn.core.java.student.shoaeeb.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//InputStreamReader and BufferedReader

public class Program1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader obj = new InputStreamReader(System.in);
		BufferedReader br =  new BufferedReader(obj);
		
		System.out.println("Enter a character: ");
		char ch=(char)br.read();
		
		//diplay the character
		System.out.printf("The character: %c",ch);
		
		
		
	}

}
