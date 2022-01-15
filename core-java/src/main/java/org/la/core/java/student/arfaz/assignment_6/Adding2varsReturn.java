package org.la.core.java.student.arfaz.assignment_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
 * int add(int, int) - add two numbers and return sum

*/

public class Adding2varsReturn {
	static Logger log = LoggerFactory.getLogger(Adding2varsReturn.class);

	public static void main(String[] args) {
		int a=2,b=3;
		int c = sum2Nums(a,b);
		log.info("Adding 2 nums = "+c);
	}
	static  int sum2Nums(int a,int n) {
		
			
		return a+n;  	
		}
	
}
