package org.jn.core.java.jawed.clss;
/**
 * @author jawednazeer
 *
 */
public class AppleFilter {

	public static boolean isGreen(Apple apple) {
		return apple.getColor().equalsIgnoreCase("green");
	}
	
	public static boolean isRed(Apple apple) {
		return apple.getColor().equalsIgnoreCase("red");
	}
	
}
