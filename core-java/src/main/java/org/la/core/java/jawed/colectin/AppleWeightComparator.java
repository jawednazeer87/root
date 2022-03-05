/**
 * 
 */
package org.la.core.java.jawed.colectin;

import java.util.Comparator;

import org.la.core.java.jawed.model.Apple;

/**
 * @author jawednazeer
 *
 */
public class AppleWeightComparator implements Comparator<Apple>{

	@Override
	public int compare(Apple o1, Apple o2) {
		return o1.getWeight().compareTo(o2.getWeight());
	}

}
