package org.jn.core.java.student.azhan.methods;

import java.util.Scanner;

public class CheckChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character: ");
		char ch = sc.next().charAt(0);
		System.out.println(checkChar(ch));
	}
	static int checkChar(char c)
	{
		if(Character.isUpperCase(c))
			return 1;
		else if(Character.isLowerCase(c))
			return -1;
		else
			return 0;
	}

}
