package org.la.core.java.student.arfaz.assignment_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
 * int add(int, int) - sub two numbers and return sum

*/

public class Sub2VarsReturn {
	static Logger log = LoggerFactory.getLogger(Sub2VarsReturn.class);

	public static void main(String[] args) {
		int a=2,b=3;
		int c = sub2Nums(a,b);
		log.info("sub 2 nums = "+c);
	}
	static  int sub2Nums(int a,int n) {
		
			
		return a-n;  	
		}
	
}
