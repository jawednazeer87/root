package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program38 {
	//string to char array
	static char[] stringToArray(String s)
	{
		char arr[]=s.toCharArray();
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a string";
		char arr[] = Program38.stringToArray(s);
		for(char c: arr)
		{
			System.out.print(c);
		}
	}

}
