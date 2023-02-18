package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program77 {
	//	77.	boolean checkFirstLastChar(String), return true if first and last character is same else return false. Node: case doesn't matter
	static boolean checkFirstLastChar(String s)
	{
		char firstChar = s.charAt(0);
		char lastChar = s.charAt(s.length()-1);
		
		if(firstChar==lastChar)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is This";
		System.out.println(Program77.checkFirstLastChar(s));
	}

}
