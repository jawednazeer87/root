package org.jn.core.java.jawed.cond;

public class SwitchCaseCharAfterDefault {

	public static void main(String[] args) {
		char a = 'f';
		switch(a) {
			case 'D': 
			case 'd': 
				System.out.println("D");
				break;
			case 'B':
			case 'b': 
				System.out.println("B");
				break;
			case 'C':
			case 'c': 
				System.out.println("C");
				break;
			case 'A':
			case 'a': 
				System.out.println("A");
				break;
			default:
				System.out.println("Default");
			case 'F':
			case 'f': 
				System.out.println("f");
		}
	}
}