package org.jn.core.java.student.shoaeeb.files;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.jn.core.java.student.shoaeeb.model.Plane;

public class Program4 {
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		try {
			FileInputStream fis = new FileInputStream("objfile2");
			ObjectInputStream ois  = new ObjectInputStream(fis);
			Plane p; 
			while((p=(Plane)ois.readObject())!=null)
			{
				p.displayData();
			}
		}
		catch(EOFException ae)
		{
			System.out.println("End of file");
		}
		
		
	}
}
