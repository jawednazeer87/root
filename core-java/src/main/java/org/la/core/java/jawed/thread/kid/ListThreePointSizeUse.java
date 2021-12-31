package org.la.core.java.jawed.thread.kid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.la.core.java.jawed.array.Copy;
import org.la.core.java.jawed.thread.ListingThreePointSix;

public class ListThreePointSizeUse {

	static Logger log = LoggerFactory.getLogger(Copy.class);
	
	public static void main(String[] args) {
		
		ListingThreePointSix listingThreePointSix = new ListingThreePointSix();
		int[] a = listingThreePointSix.getA();
		a[0]=-1;
		int[] b = listingThreePointSix.getA();
		log.info("b[0]: "+b[0]);
	}
}
