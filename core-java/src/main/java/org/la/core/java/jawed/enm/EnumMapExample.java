/**
 * 
 */
package org.la.core.java.jawed.enm;

import java.util.EnumMap;

/**
 * @author jawednazeer
 *
 */
public class EnumMapExample {

	public static void main(String[] args) {
		EnumMap<Level, String> enumMap = new EnumMap<Level, String>(Level.class);
		enumMap.put(Level.HIGH  , "High level");
		enumMap.put(Level.MEDIUM, "Medium level");
		enumMap.put(Level.LOW   , "Low level");
		String levelValue = enumMap.get(Level.HIGH);
		System.out.println("levelValue: "+levelValue);
	}
}
