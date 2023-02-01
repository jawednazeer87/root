package org.jn.core.java.student.shoaeeb.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

import org.jn.core.java.student.shoaeeb.model.Plane;

public class Program3 {
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("objfile2");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter how many passengers");
		int n=Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++)
		{
			Plane p = new Plane();
			p.getData();
			oos.writeObject(p);
		}
		oos.close();
	}
}
