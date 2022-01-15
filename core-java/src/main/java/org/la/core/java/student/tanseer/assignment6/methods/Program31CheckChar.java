package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * int checkChar(char c) 
	return 1 if argument is capital letter or -1 if lower case, 0 if not alphabet

 */
public class Program31CheckChar 
{

	public static void main(String[] args) 
	{
		int n = checkChar('1');
		System.out.println(n);
	}
	
	static int checkChar(char c)
	{
		if(c >= 'A' && c <= 'Z')
		{
			return 1;
		}
		else if(c >= 'a' && c <= 'z')
		{
			return -1;
		}
		else
			return 0;
	}
}

