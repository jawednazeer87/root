package org.la.core.java.student.arfaz.assignment_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
 * int mul(int, int) - sub two numbers and return sum

*/

public class Mul2VarsReturn {
	static Logger log = LoggerFactory.getLogger(Mul2VarsReturn.class);

	public static void main(String[] args) {
		int a=2,b=3;
		int c = mul2Nums(a,b);
		log.info("mul 2 nums = "+c);
	}
	static  int mul2Nums(int a,int n) {
		
			
		return a*n;  	
		}
	
}
