package org.la.core.java.student.tanseer.conditional.statements.assignment3;

public class Program32 {

	public static void main(String[] args) 
	{ 
		boolean a=true, b = false;
		if (a) {
			System.out.println("A");
		} else if (a && b) {
			System.out.println("A && B");
		} else {
			if (!b) {
				System.out.println("notB");
			} else {
				System.out.println("ELSE");
			}
		}

	}
		
}


