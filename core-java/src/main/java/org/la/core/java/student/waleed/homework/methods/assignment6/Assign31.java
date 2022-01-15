package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign31 {

	public static void main(String[] args) {
		
		
		char c= 'W';
		int m = checkChar( c);
		System.out.println(m);
	}
		static int checkChar(char c) {
		 if (c >= 'A' && c  <= 'Z') {
		return 1 ;}
			 else if (c >='a' && c<= 'z') {
				return -1;}
			 else
		            return 0;

	}

}
