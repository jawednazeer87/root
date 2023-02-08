package org.jn.core.java.student.shoaeeb.arrays.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many subjects: ");
		int n= Integer.parseInt(br.readLine());
		int subjects[] = new int[n];
		for(int i=0; i<n; i++)
		{
			subjects[i]=Integer.parseInt(br.readLine());
		}
		int tot=0;
		for(int subject: subjects)
		{
			tot+=subject;
		}
		System.out.println("Total: "+tot);
		System.out.println("Percentage: "+(float)tot/n);
	}

}
