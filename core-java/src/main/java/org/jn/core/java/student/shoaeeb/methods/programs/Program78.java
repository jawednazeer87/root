package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program78 {

	//	78.	boolean checkFirstLastChar(String), return true if first and last character is upper case character else return false.
	static boolean checkFirstLastChar(String s)
	{
		char firstChar = s.charAt(0);
		char lastChar =s.charAt(s.length()-1);
		
		if(Character.isUpperCase(firstChar)&& Character.isUpperCase(lastChar))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a sentence";
		System.out.println(checkFirstLastChar(s));
		s="THIS IS A SENTENCE";
		System.out.println(checkFirstLastChar(s));

	}

}
