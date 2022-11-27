package org.jn.core.java.jawed.array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringFive {

	static Logger log = LoggerFactory.getLogger(StringFive.class);
	
	public static void main(String[] args) {
		
		String s = "jawed";
		String t = "jawed";
		if(s==t) {
			log.info("equals");
		}
		else {
			log.info("not equal");
		}
		
	}
}
