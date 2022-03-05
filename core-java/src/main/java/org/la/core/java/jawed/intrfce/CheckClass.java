/**
 * 
 */
package org.la.core.java.jawed.intrfce;

import org.la.core.java.jawed.lambda.Check;

/**
 * @author jawednazeer
 *
 */
public class CheckClass implements Check{

	@Override
	public int sum(int a, int b) {
		return a+b;
	}

	@Override
	public double div(int x, int y) {
		return x/(double)y;
	}
	
	@Override
	public int prod(int x, int y) {
		return x-y;
	}
}
