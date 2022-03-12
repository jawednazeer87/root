package org.la.core.java.jawed.enm;

/**
 * @author jawednazeer
 *
 */
public class EnumLevel {
	public static void main(String[] args) {
		Level level = Level.HIGH;
		int val = level.getLevelCode();
		System.out.println("val: "+val);
		System.out.println("val: "+level.ordinal());
	}
}
