package org.jn.core.java.student.shoaeeb.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter Sex: ");
		
		char ch=br.readLine().charAt(0);
		
		System.out.println("Enter Employee name:");
		String name = br.readLine();
		
		
		//display 
		System.out.println("Id: "+id+" Gender: "+ch+" Name: "+name);
	}

}
