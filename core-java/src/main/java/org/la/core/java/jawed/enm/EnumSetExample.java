package org.la.core.java.jawed.enm;

import java.util.EnumSet;

/**
 * @author jawednazeer
 *
 */
public class EnumSetExample {

	public static void main(String[] args) {
		EnumSet<Level> enumSet = EnumSet.of(Level.HIGH, Level.MEDIUM);
		enumSet.forEach(level -> System.out.println(level));
	}
}
