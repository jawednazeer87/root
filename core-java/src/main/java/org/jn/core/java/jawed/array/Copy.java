package org.jn.core.java.jawed.array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Copy {

	static Logger log = LoggerFactory.getLogger(Copy.class);
	
	public static void main(String[] args) {
//		log.info("This is info log");
		int s[] = {1, 2, 3, 4, 5};
		int t[] = new int[s.length];
		for(int i=0 ; i<s.length ; i++) {
			t[i] = s[i];
		}
		
		for(int i=0 ; i<t.length ; i++) {
//			log.warn("t["+i+"] = "+t[i]);
			System.out.println("t["+i+"] = "+t[i]);
		}
		t[0] = 13222;
//		log.info("s[0]: "+s[0]);
		System.out.println("s[0]: "+s[0]);
//		log.error("it is an error message");
//		log.debug("it is an error message");
	}
}
