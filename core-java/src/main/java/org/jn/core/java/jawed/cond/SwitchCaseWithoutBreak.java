package org.jn.core.java.jawed.cond;

public class SwitchCaseWithoutBreak {

	public static void main(String[] args) {
		int a = 1;
		
		switch(a) {
			case 1: 
				System.out.println("one");
			case 2: 
				System.out.println("two");
			case 3: 
				System.out.println("three");
			case 4: 
				System.out.println("four");
			case 5: 
				System.out.println("five");
			default:
				System.out.println("default");
		}
	}
}