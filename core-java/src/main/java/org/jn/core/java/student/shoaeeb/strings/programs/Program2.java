package org.jn.core.java.student.shoaeeb.strings.programs;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a String";
		int n=s.length();
		char arr[] = new char[n];
		s.getChars(0, n, arr, 0);
		for(char c: arr)
		{
			System.out.print(c);
		}
	}

}
