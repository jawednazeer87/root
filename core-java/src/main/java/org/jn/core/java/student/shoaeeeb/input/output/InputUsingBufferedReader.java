package org.jn.core.java.student.shoaeeeb.input.output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUsingBufferedReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter name: ");
		String name=br.readLine();
		System.out.println("Enter salary:");
		float sal=Float.parseFloat(br.readLine());
		
		System.out.println("Name: "+name+ " id: "+id+" Salary "+sal);
		
		
		
	}

}
