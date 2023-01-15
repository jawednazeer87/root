package org.jn.core.java.student.shoaeeb.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many Strings? ");
		int n=Integer.parseInt(br.readLine());
		String str[] = new String[n];
		
		for(int i=0; i<n; i++)
		{
			str[i]=br.readLine();
		}
		
		System.out.println("Enter the String to search");
		String search = br.readLine();
		boolean found=false;
		for(int i=0; i<n; i++)
		{
			if(search.equalsIgnoreCase(str[i]))
			{
				found=true;
				int pos=(i+1);
				System.out.println("String found at position: "+pos);
				break;
			}
		}
		if(!found)
		{
			System.out.println("Not found");
		}
		
	}

}
