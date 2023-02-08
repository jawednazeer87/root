package org.jn.core.java.student.shoaeeb.input.ouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {
	//accept input from keyboard;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a character");
		char ch=(char)br.read();
		System.out.println("Character: "+ch);
		
	}

}
