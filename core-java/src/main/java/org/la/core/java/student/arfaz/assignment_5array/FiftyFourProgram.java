	package org.la.core.java.student.arfaz.assignment_5array;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*  	wap to find whether an array of characters having 'Z' or not?
		Suppose given array is ['a', '5', '7', 'p'] -> this array doesn't have 'Z'
		Suppose given array is ['A', '5', 'Z', 'p'] -> this array has 'Z'
*/

	

public class FiftyFourProgram {

	static Logger log = LoggerFactory.getLogger(FiftyFourProgram.class);

	public static void main(String[] args) {

		char c[]= {'A', '5', 'Z', 'p'};
		int f=0; 
		
		
		
			for(int k=0;k<c.length;k++)  {
				if(c[k]=='Z')
					f=1;
			}
			if(f==1)
				log.info("this array has 'Z'");
			else
				log.info("this array doesn't have 'Z'");
	}

			 
				
		
	}


