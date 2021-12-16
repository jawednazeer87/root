package org.la.core.java.student.hasan.assignment03;

public class CapitalOrSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a= 'A';
		if (a>='a' && a<='z')
			System.out.println("small");
		else if (a>='A' && a<='Z')
			System.out.println("capital");
		else
			System.out.println(a+" is not an alphabet");
	}

}
