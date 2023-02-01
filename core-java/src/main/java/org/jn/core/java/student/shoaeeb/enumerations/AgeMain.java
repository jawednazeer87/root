package org.jn.core.java.student.shoaeeb.enumerations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AgeMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Age persons[] = Age.values();
		for(Age a: persons)
		{
			int no=a.ordinal();
			System.out.println(no+" "+a);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice=Integer.parseInt(br.readLine());
		System.out.println("Age: "+Age.getAge(choice));
		System.out.println("Height:"+Age.getHeight(choice));
		
		
		
	}

}
