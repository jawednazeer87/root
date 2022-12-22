package org.jn.core.java.student.shoaeeb.method;

public class Program24 {

	static int checkChar(char c)
	{
		if(c>=65 && c<=90)
		{
			return 1;
		}
		else if(c>=97 && c<=122)
		{
			return -1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char ch = 'c';
	System.out.println(checkChar(ch));
	}

}
