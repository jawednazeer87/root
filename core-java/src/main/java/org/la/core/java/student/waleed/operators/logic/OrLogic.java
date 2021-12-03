package org.la.core.java.student.waleed.operators.logic;

public class OrLogic {

	public static void main(String[] args) {
		boolean a = true, b= false;
		a = a || b;
	
		System.out.println("a: "+a);
		a = b || a;
		System.out.println("a: "+a);
		a = false || false;
		System.out.println("a: "+a);
		a = false || true;
		System.out.println("a: "+a);
	}

	}


