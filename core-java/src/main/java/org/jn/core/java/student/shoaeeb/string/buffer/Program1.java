package org.jn.core.java.student.shoaeeb.string.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String surname,middlename,lastname;
		String name;
		StringBuffer sb =new StringBuffer();
		
		System.out.println("Enter surname: ");
		surname=br.readLine();
		System.out.println("Enter middlename: ");
		middlename=br.readLine();
		System.out.println("Enter lastname: ");
		lastname=br.readLine();
		name=surname+lastname;
		sb.append(name);
		System.out.println("Name: "+name);
		sb.insert(lastname.length()+1, middlename);
		System.out.println("Full Name: " +sb);
		System.out.println(sb.reverse());
		
	}

}
