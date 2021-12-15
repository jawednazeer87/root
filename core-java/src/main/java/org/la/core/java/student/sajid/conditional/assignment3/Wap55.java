package org.la.core.java.student.sajid.conditional.assignment3;

public class Wap55 {

	public static void main(String[] args) {
		int upprcaseA = 'A';
		int upprCaseZ = 'Z';
		
		int lowercasea = 'a';
		int lowercasez = 'z';
		
		int givenChar = 'e';
		
		System.out.println("ASCII value of Given Char is : "+givenChar);
		
		System.out.println("ASCII Value of A: "+upprcaseA);
		System.out.println("ASCII Value of Z: "+upprCaseZ);
		
		System.out.println("ASCII Value of a: "+lowercasea);
		System.out.println("ASCII Value of z: "+lowercasez);
		
		if (givenChar >= upprcaseA && givenChar <= upprCaseZ ) {
			System.out.println("capital ");
		}else if (givenChar >= lowercasea && givenChar <= lowercasez )  {
			System.out.println("small ");
		}

	}

}		



