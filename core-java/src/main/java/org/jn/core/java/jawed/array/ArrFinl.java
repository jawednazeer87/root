package org.jn.core.java.jawed.array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrFinl {

	static Logger log = LoggerFactory.getLogger(ArrFinl.class);
	
	public static void main(String[] args) {
		
		final int[] a = {1, 2, 3};
		log.info("a[0]: {}", a[0]);
		a[0] = 55;
		log.info("a[0]: {}", a[0]);
		//a = new int[2];		//error, read only variable value cannot change
		int b[] = new int[2];
		b = new int[]{2, 3, 4};
		int[] c = {1, 2, 3};
		c = new int[4];
		
	}
}
