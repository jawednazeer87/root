package org.jn.core.java.student.shoaeeb.exceptions.handling;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Program4.message();
		}
		catch(StringIndexOutOfBoundsException ae)
		{
			System.out.println("check index");
			ae.printStackTrace();
		}
	}

}
