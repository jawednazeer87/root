package org.jn.core.java.student.shoaeeb.files;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

import org.jn.core.java.student.shoaeeb.model.Employee;

public class Program1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter how many employees");
		int n=Integer.parseInt(br.readLine());
		FileOutputStream fos = new FileOutputStream("objfile");
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
		for(int i=0; i<n; i++)
		{
			Employee e = new Employee();
			e.getData();
			oos.writeObject(e);
		}
		oos.close();
	}

}
