package org.la.core.java.student.hasan.assignment03;

public class CapitalOrSmall2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a= 'A';
		if (a>='a' && a<='z')
			System.out.println("'"+a+"' -> small");
		else if (a>='A' && a<='Z')
			System.out.println("'"+a+"' -> capital");
		else
			System.out.println(a+" is not an alphabet");
	}

}
