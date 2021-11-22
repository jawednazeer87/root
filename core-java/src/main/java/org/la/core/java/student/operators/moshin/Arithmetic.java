package org.la.core.java.student.operators.moshin;

public class Arithmetic {
		
public static void main(String[] args) {
		// Arithmetic operators
	
		int x =  8 + 7 * 1 / 4;
		
		System.out.println("x: "+x);
		System.out.println();
		
		// Another Example
		
		int op =  8 + 6 / 8 * 8;
		
		System.out.println("operation: "+op);
		System.out.println();
		
		// AddPreIncrement
		
		int z = 4;
		System.out.println("z: "+z);
		int x1 =  5 * ++z;
		System.out.println("z: "+z);
		System.out.println("x: "+x1);
		System.out.println();
		
		// AddPostincrement
		
		int z1 = 4;
		System.out.println("z: "+z1);
		int x2 =  5 * z1++;
		System.out.println("z: "+z1);
		System.out.println("x: "+x2);
		System.out.println();
		
		//Modulus
		
		int i = 9 % 3;
		System.out.println("remainder: "+i);
		System.out.println();
		
		int i1 = 9 % 2;
		System.out.println("remainder: "+i1);
		System.out.println();
		
	

	}
}
