package org.la.core.java.student.arfaz.assignment_6Fun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
int reminder(int, int) - find remainder and return 
*/

public class Remain2VarsReturn {
	static Logger log = LoggerFactory.getLogger(Remain2VarsReturn.class);

	public static void main(String[] args) {
		int a=12,b=3;
		int c = remainder2Nums(a,b);
		log.info("rem 2 nums = "+c);
	}
	static  int remainder2Nums(int a,int n) {
		
			
		return a%n;  	
		}
	
}
