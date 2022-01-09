package org.la.core.java.student.arfaz.assignment_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
double average(int, int, int) - find average of formal arguments and return result

*/

public class AvgDouble2VarsReturn {
	static Logger log = LoggerFactory.getLogger(AvgDouble2VarsReturn.class);

	public static void main(String[] args) {
		double a=12,b=3,c=10;
		double d = average2Nums(a,b,c);
		log.info("div 2 nums = "+d);
	}
	static  double average2Nums(double a,double n,double b) {
		return (a+n+b)/3;  	
		}
	
}
