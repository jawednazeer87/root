package org.jn.core.java.student.shoaeeeb.input.output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
	static boolean leapYear(int year)
	{
		boolean flag=true;
		if(year%100==0 && year%400==0)
		{
			return true;
		}
		else if(year%100!=0 && year%4==0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter year: ");
		int year=Integer.parseInt(br.readLine());
		
		if(leapYear(year))
		{
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
	}

}
