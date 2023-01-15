package org.jn.core.java.student.shoaeeb.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//reading string using Buffer Reader

public class Program2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a name: ");
		String name = br.readLine();
		
		//readLine accepts input in string 
		//displaying the message
		System.out.printf("Name is: %s",name);
		
	}

}
