package org.jn.core.java.student.shoaeeb.exceptions.handling;

public class Sample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new NullPointerException("Exception Data");
		}
		
		catch(NullPointerException ne)
		{
			System.out.println(ne);
		}
	}

}
