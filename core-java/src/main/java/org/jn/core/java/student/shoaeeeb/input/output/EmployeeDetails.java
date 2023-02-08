package org.jn.core.java.student.shoaeeeb.input.output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeDetails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter id");
		int id = Integer.parseInt(br.readLine());
		System.out.println("enter name");
		String name=br.readLine();
		System.out.println("enter gender");
		char ch=(char)br.read();
		//skip 2 chacters;
		br.skip(2);
		//solution 2 ch=(char)br.read.charAt(0)
		System.out.println("Enter salary");
		float sal=Float.parseFloat(br.readLine());
		
		System.out.printf("id:  %d name: %s gender:%c salary:%f",id,name,ch,sal);
		
	}

}
