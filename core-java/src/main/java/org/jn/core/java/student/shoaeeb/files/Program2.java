package org.jn.core.java.student.shoaeeb.files;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.jn.core.java.student.shoaeeb.model.Employee;

public class Program2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis =null;
		ObjectInputStream ois=null;
		try {
			 fis = new FileInputStream("objfile");
			 ois = new ObjectInputStream(fis);
			Employee e;
			while((e=(Employee)ois.readObject())!=null)
			{
				e.displayData();
			}
			}
			catch(EOFException | FileNotFoundException e)
			{
				System.out.println("End of file");
			}
			finally {
				ois.close();
			}
		
		
	}

}
