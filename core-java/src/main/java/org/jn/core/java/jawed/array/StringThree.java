package org.jn.core.java.jawed.array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringThree {

	static Logger log = LoggerFactory.getLogger(StringThree.class);
	
	public static void main(String[] args) {
		
		String s = "jawed";
		log.info(s);
		s = s + 123.4;
		log.info(s);
		s = "dfga" + 3234;
		log.info(s);
	}
}
