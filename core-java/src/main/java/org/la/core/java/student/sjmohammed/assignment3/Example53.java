package org.la.core.java.student.sjmohammed.assignment3;

public class Example53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-10;
		if(a>=0) {
			System.out.println("Positive");
			if(a>9 && a<100) {
				System.out.println("Double Digit");
			}else if(a>=0 && a<=9) {
				System.out.println("Single Digit");
			}
		} 
		else{
			System.out.println("Negative");
		}
	}

}
