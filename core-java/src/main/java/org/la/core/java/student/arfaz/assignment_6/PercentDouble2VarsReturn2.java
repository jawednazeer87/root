package org.la.core.java.student.arfaz.assignment_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
double percent(int, int, int, int, int)
		suppose 5 arguments are marks in subjects, each subject is of 100 marks,
	

*/

public class PercentDouble2VarsReturn2 {
	static Logger log = LoggerFactory.getLogger(PercentDouble2VarsReturn2.class);

	public static void main(String[] args) {
		double a=60,b=30,c=50,e=70,f=70;
		double d = percent2Nums(a,b,c,e,f)*100;
		log.info("percentage 2 nums = "+d);
	}
	static  double percent2Nums(double a,double s,double b,double e,double f) {
		
		return (a+s+b+e+f)/500;  	
		}
	
}
