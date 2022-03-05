/**
 * 
 */
package org.la.core.java.jawed.lambda;

import java.util.function.Function;

/**
 * @author jawednazeer
 *
 */
public class FunctionMain {

	public static void main(String[] args) {
		Function<String, Integer> strInt = s -> Integer.valueOf(s);
		Integer i = strInt.apply("12345");
		System.out.println(i);
	}
}
