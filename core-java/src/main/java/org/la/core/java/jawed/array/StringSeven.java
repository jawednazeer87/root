package org.la.core.java.jawed.array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringSeven {

	static Logger log = LoggerFactory.getLogger(StringSeven.class);
	
	public static void main(String[] args) {
		
		String str = "hello \"world\"";
		
        log.info("str: {}", str);
        		
	}
}
