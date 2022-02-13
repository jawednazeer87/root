package org.la.core.java.jawed.abstrct.man;

import org.la.core.java.jawed.abstrct.Mobile;
import org.la.core.java.jawed.abstrct.SmartPhone;

/**
 * @author jawednazeer
 *
 */
public class MainMobile {

	public static void main(String[] args) {
		Mobile mobile = new SmartPhone();
		mobile.display();
		System.out.println("sum: "+mobile.sum(1, 10));
	}
	
}
