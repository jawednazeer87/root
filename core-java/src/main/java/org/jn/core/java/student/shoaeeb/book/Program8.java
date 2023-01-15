package org.jn.core.java.student.shoaeeb.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program8 {
	//leap year or not 
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a year to check whether a year or not");
		String str = br.readLine();
		int year = Integer.parseInt(str);
		
		//condition to check leap year or not
		if(year%100 ==0 && year%400 ==0)
		{
			System.out.println(year+" is a leap year");
		}
		else if(year%100!=0 && year%4==0)
		{
			System.out.println(year+ " is a leap year");
		}
		else {
			System.out.println(year+ " is not a leap year");
		}
			
		
	}

}
