package org.la.core.java.student.arfaz.assignment_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
long factorial(int)
		find factorial of given argument and return result
		

*/

public class FactorialUseMet {
	static Logger log = LoggerFactory.getLogger(FactorialUseMet.class);

	public static void main(String[] args) {
		int a=5;
		long d = fact(a);
		log.info("factorial of"+a+" = "+d);
	}
	static  long fact(int a) {
		int f=1;
		  	for(int i=1;i<=a;i++)
		  		f=f*i;
		  	return f;
		}
	
}
