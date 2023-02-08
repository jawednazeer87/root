package org.jn.core.java.student.shoaeeb.input.ouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program9 {
	//to find out a year is leap or not
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year=Integer.parseInt(br.readLine());
		if(year%100==0 && year%400 == 0)
			System.out.println(year+ " is a leap year");
		else if(year%100!=0 && year%4==0)
			System.out.println(year+ " is a leap year");
		else 
			System.out.println(year+" is not a leap year") ;
			
	}

}
