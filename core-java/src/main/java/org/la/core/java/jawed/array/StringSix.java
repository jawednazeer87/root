package org.la.core.java.jawed.array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringSix {

	static Logger log = LoggerFactory.getLogger(StringSix.class);
	
	public static void main(String[] args) {
		
		String str = "hello ";
		str.concat("world!");
        log.info(str);
        str += "java";
        log.info(str);
        System.out.println("sysout");
		
	}
}
