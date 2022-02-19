/**
 * 
 */
package org.la.core.java.jawed.intrfce.main;

import org.la.core.java.jawed.intrfce.FirstInterface;
import org.la.core.java.jawed.intrfce.FirstInterfaceChild;

/**
 * @author jawednazeer
 *
 */
public class FirstInterfaceMain {

	public static void main(String[] args) {
		FirstInterface fi = new FirstInterfaceChild();
		fi.display();
		int p = fi.prime(9);
		System.out.println("prime: "+p);
	}
}
