package org.la.core.java.student.arfaz.assignment_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
	
	
	
	int checkChar(char c) 
		return 1 if argument is capital letter or -1 if lower case, 0 if not alphabet
*/

public class CheckChar {
//	static Logger log = LoggerFactory.getLogger(PrintStarReverseRight.class);

	public static void main(String[] args) {
		char c = 'A';
		System.out.println(checkChar(c));
	}
	static  int checkChar(char c) {
		if(c>=65 && c<=91)          // A = 65 is ASCII table
			return 1;
		else if(c>=97&&c<=123)	//a=97 is ascii table
			return -1;
		
			return 0;
		
	}
	
}
