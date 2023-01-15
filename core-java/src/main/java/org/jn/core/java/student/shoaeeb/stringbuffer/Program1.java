package org.jn.core.java.student.shoaeeb.stringbuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {

		public static void main(String args[]) throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuffer sb = new StringBuffer();
			System.out.println("Enter Surname: ");
			String sur = br.readLine();
			System.out.println("Enter middle name: ");
			String mid = br.readLine();
			System.out.println("Enter last Name ");
			String last=br.readLine();
			sb.append(sur);
			sb.append(last);
			System.out.println("Name = "+sb);
			int n=sur.length();
			sb.insert(n,mid);
			System.out.println("Full Name: "+sb);
			System.out.println("In reverse: "+sb.reverse());
			
		}
}
