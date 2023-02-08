package org.jn.core.java.student.shoaeeb.input.ouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Id: ");
		int id=br.read();
		System.out.println("Enter Gender: ");
		char sex=br.readLine().charAt(0);
		System.out.println("Enter name: ");
		String name=br.readLine();
		
		System.out.println("Id: "+id+" Gender: "+sex+" Name: "+name);
	}

}
