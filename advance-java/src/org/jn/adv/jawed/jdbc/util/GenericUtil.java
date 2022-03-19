package org.jn.adv.jawed.jdbc.util;

import java.util.List;

/**
 * @author jawednazeer
 */
public class GenericUtil {
	public static <T> void print(List<T> list) {
		System.out.println("[");
		for(T t : list) {
			System.out.println(t);
		}
		System.out.println("]");
	}
	
	
}
