package org.jn.core.java.jawed.str;

public class StringOperation {

	public static void main(String[] args) {
		String s = "source string";
		String t = s.concat(" tail");
		System.out.println("s: " + s);
		System.out.println("t: " + t);
		System.out.println("contains : " + s.contains("head"));
		System.out.println("contains : " + s.contains("ring"));
		System.out.println("indexOf : " + s.indexOf("head"));
		System.out.println("indexOf : " + s.indexOf("ring"));
		String r = s.replace("string", "text");
		System.out.println("r: " + r);
		System.out.println("s: " + s);
		String c = s + "dsfas";
		System.out.println("c: " + c);
	}
}
