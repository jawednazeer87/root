/**
 * 
 */
package org.la.core.java.jawed.intrfce;

import org.la.core.java.jawed.lambda.Check;

/**
 * @author jawednazeer
 *
 */
public class CheckMain {

	public static void main(String[] args) {
		Check check = new Check(){
			@Override
			public int sum(int x, int y) {
				return x+y;
			}
			@Override
			public double div(int i, int j) {
				return (double)i/j;
			}
		};
	}
}
