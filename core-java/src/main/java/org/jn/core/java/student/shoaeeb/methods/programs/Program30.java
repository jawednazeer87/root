package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program30 {
//	30.	int checkChar(char c), return 1 if argument is capital letter or -1 if lower case, 0 if not alphabet
	
	static int checkChar(char c)
	{
		if(Character.isUpperCase(c))
		{
			return 1;
		}
		else if(Character.isLowerCase(c))
		{
			return -1;
		}
		else {
			return 0;
			//not a character
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c  = 'A';
		System.out.println(checkChar(c));
	}

}
