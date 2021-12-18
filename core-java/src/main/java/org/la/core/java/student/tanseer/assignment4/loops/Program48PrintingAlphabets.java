package org.la.core.java.student.tanseer.assignment4.loops;

public class Program48PrintingAlphabets {

	public static void main(String[] args) {
		
		for(char c = 97 ; c <= 122 ;c++) {
			System.out.print(c+"  ");
		}
		System.out.println();
		
		char i = 122;
		while(i >= 97 ) {
			System.out.print(i+"  ");
			i--;
		}
	}
}