package org.la.core.java.jawed.array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringFour {

	static Logger log = LoggerFactory.getLogger(StringFour.class);
	
	public static void main(String[] args) {
		
		String s = new String("jawed");
		String t = new String("jawed");
		if(s==t) {
			log.info("equals");
		}
		else {
			log.info("not equal");
		}
		
	}
}
