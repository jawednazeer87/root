package org.jn.core.java.student.shoaeeb.dsa;

public class ReverseString {

	public static String reverseString(String s)
	{
		String st = " ";
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			st=ch+st;
		}
		return st;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Geeks for Geeks";
		System.out.println(reverseString(s));

		
	}

}
