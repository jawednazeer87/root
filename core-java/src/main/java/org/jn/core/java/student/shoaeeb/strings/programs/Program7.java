package org.jn.core.java.student.shoaeeb.strings.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n;
		System.out.println("How many Strings: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		String s[] = new String[n];
		System.out.println("Enter strings one by one");
		for(int i=0; i<n; i++)
		{
			s[i]=br.readLine();
		}
		
		boolean flag=false;
		for(int i=0; i<n; i++)
		{
			if(s[i].contains("world"))
			{
				System.out.println("contains");
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Does not contains");
		}
	}

}
