package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program80 {
	static boolean checkFirstLastChar(String s)
	{
		char firstChar = s.charAt(0);
		char lastChar =s.charAt(s.length()-1);
		
		if(Character.isUpperCase(firstChar)&& Character.isLowerCase(lastChar))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a sentence";
		System.out.println(checkFirstLastChar(s));
		s="this is a sentence";
		System.out.println(checkFirstLastChar(s));

	}

}
