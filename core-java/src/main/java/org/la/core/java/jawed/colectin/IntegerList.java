/**
 * 
 */
package org.la.core.java.jawed.colectin;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jawednazeer
 *
 */
public class IntegerList {

	public static void main(String[] args) {
		List<Integer> listInt = new ArrayList<>();
		listInt.add(1);
		listInt.add(new Integer(3));
		listInt.add(44);
		for(int i : listInt) {
			System.out.println(i);
		}
	}
}
