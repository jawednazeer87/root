/**
 * 
 */
package org.la.core.java.jawed.intrfce;

/**
 * @author jawednazeer
 *
 */
public class ResultMain {
	public static void main(String[] args) {
		Result result = new Result() {
			@Override
			public boolean test() {
				return false;
			}
		};
		
		boolean res = result.test();
		System.out.println("res: "+res);
	}
}
