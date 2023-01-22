package org.jn.core.java.jawed.str;

public class StringPropertyExample3 {

	public static void main(String[] args) {
		String s1 = new String("simple way").intern();
		String s2 = new String("simple way").intern();
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s1 and s2 are equals: " + (s1==s2));
		System.out.println("s1 and s2 are equals: " + s1.equals(s2));
	}
}
