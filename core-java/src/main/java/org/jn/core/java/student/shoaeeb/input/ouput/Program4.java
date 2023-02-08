package org.jn.core.java.student.shoaeeb.input.ouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program4 {
	//accepting float value
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		float f;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		f=Float.parseFloat(br.readLine());
		System.out.println("You Entered Number: "+f);
	}

}
