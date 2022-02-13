/**
 * 
 */
package org.la.core.java.jawed.abstrct.man;

import org.la.core.java.jawed.abstrct.Bird;
import org.la.core.java.jawed.abstrct.DuckKid;

/**
 * @author jawednazeer
 *
 */
public class BirdMain {
	public static void main(String[] args) {
		Bird bird = new DuckKid();
		System.out.println("fly: "+bird.canFly());
		System.out.println("swim: "+bird.canSwim());
	}
}
