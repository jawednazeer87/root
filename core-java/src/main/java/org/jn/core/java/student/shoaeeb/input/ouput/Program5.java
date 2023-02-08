package org.jn.core.java.student.shoaeeb.input.ouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Id: ");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter gender");
		char sex=(char)br.read();
		br.skip(2);
		System.out.println("Enter name: ");
		String name=br.readLine();
		
		System.out.println("Id: "+id+"Sex: "+sex+" Name: "+name);
		
		
	}

}
