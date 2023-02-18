package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program79 {
	static boolean checkFirstLastChar(String s)
	{
		char firstChar = s.charAt(0);
		char lastChar =s.charAt(s.length()-1);
		
		if(Character.isLowerCase(firstChar)&& Character.isLowerCase(lastChar))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "this is  a sentence";
		System.out.println(checkFirstLastChar(s));
		s="THIS IS A SENTENCE";
		System.out.println(checkFirstLastChar(s));

	}

}
