package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program34 {
	static boolean isVowel(char ch)
	{
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		System.out.println(Program34.isVowel(ch));
	}

}
