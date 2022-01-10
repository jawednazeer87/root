package org.la.core.java.student.arfaz.assignment_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
	boolean prime(int)
		check whether given number is prime or not and return true or false
		

*/

public class IsPrime {
	static Logger log = LoggerFactory.getLogger(IsPrime.class);

	public static void main(String[] args) {
		int a=6;
		boolean d = isPrime(a);
		log.info(" "+d);
	}
	static  boolean isPrime(int a) {
		int i=0;
		  	for( i=2;i<a;i++)
		  		if(a%i==0) {
		  			break;
		  		}
		  	if(i==a)
		  	return true;
		 return false;
		}
	
}
