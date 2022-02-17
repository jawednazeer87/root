package org.la.core.java.student.arfaz.assignment_6Fun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
	void fibonocci(int)
		print fibonacci series 
	

*/

public class FibanacciSeries {
	static Logger log = LoggerFactory.getLogger(FibanacciSeries.class);

	public static void main(String[] args) {
		int a=6;
		 fibonacci(a);
	}
	static  void fibonacci(int a) {
		int k=0,j=1,fibon;
		log.info(" "+k+","+j);
		  	for( int i=2;i<=a;i++) {
		  		fibon = k+j;
		  		k=j;
		  		j=fibon;
				log.info(""+fibon);

		  	}
		  	
	}
	
}
