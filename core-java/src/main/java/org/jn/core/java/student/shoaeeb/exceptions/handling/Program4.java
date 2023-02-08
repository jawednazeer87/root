package org.jn.core.java.student.shoaeeb.exceptions.handling;

public class Program4 {
	static void message() {
		String name =  "Sam";
		try {
			char ch = name.charAt(4);
		}
		catch(StringIndexOutOfBoundsException ae)
		{
			throw ae;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
