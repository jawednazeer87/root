package org.la.core.java.student.tanseer.assignment5.arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestLog {

static Logger log = LoggerFactory.getLogger(TestLog.class);
	
	public static void main(String[] args) 
	{
		log.info("\n");
		log.info("This is info log.\n");
		int s[] = {1, 2, 3, 4, 5};
		int t[] = new int[s.length];
		for(int i=0 ; i<s.length ; i++) {
			t[i] = s[i];
		}
		
		for(int i=0 ; i<t.length ; i++) {
			log.info(" t["+i+"] = "+t[i]);
		}
		t[0] = 13222;
		log.info("s[0]: "+s[0]);
		log.error("it is an error message");
		log.debug("it is an error message");
	
			
			
			
	}

}
