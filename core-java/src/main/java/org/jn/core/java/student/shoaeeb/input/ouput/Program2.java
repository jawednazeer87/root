package org.jn.core.java.student.shoaeeb.input.ouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 {
	
	//accept a string using buffer reader
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		System.out.println("Enter your name: ");
		name=br.readLine();
		System.out.println("Name: "+name);
	}

}
