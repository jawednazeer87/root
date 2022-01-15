package org.la.core.java.jawed.array.string;

/**
 * @author jawednazeer
 * different string replacement predefined methods
 */
public class DifferentMethodsOfString {

	public static void main(String[] args) {
		String str = "Welcome to Java world Java";
		String repl = str.replace('o', 'p');
		System.out.println(str);
		System.out.println(repl);
		
		repl = str.replace("Java", "python");
		System.out.println(str);
		System.out.println(repl);
		
		repl = str.replaceFirst("Java", "python");
		System.out.println(str);
		System.out.println(repl);
		
		repl = str.replaceAll("Java", "python");
		System.out.println(str);
		System.out.println(repl);
		
	}
}
