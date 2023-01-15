package org.jn.core.java.student.shoaeeb.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program3{
 public static void main(String args[]) throws IOException
 {
	 //getting integer using buffered reader
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter a number");
	 String str=br.readLine();
	 //converting from string to integer
	 int n=Integer.parseInt(str);
	System.out.println("display the number");

	System.out.printf("Integer: %d",n);
 }
}
