package org.jn.core.java.student.shoaeeb.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program4 {
	//accepting a float and double value;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter float value");
		float f=Float.parseFloat(br.readLine());
		System.out.println("Enter a double ");
		double d=Double.parseDouble(br.readLine());
		
		//display the message
		System.out.println("Float Value: "+f+" Double Value: "+d);
	}

}
