package org.la.core.java.student.arfaz.assignment_6;

//import org.la.core.java.jawed.array.Copy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
 * int average(int[])
		find the average of array elements and return average
*/

public class ReturnAvg {
	static Logger log = LoggerFactory.getLogger(ReturnAvg.class);

	public static void main(String[] args) {
		int a[] = {5,6,7,8,9};
		int c= average(a);
		log.info("Sum = "+c);
	}
	static  int average(int[]a) {
		int s=0,c=0;
		for(int i=0;i<a.length;i++)  {
          s+= a[i];
			c++;			
		}
		return s/c;  	}
}
