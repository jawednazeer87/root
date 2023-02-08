package org.jn.core.java.student.shoaeeb.input.ouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program3 {
	//accepting integer using bufferedreader
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int number = Integer.parseInt(br.readLine());
		System.out.println("You entered number: "+number);
	}

}
