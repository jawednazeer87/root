package org.jn.core.java.student.shoaeeb.exceptions.handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program3 {

	private String name;
	
	void accept() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		name=br.readLine();
		
	}
	void display() {
		System.out.println("Name: "+name);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Program3 p  =new Program3();
		p.accept();
		p.display();
	}

}
