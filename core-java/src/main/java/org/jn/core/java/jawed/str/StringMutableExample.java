package org.jn.core.java.jawed.str;

public class StringMutableExample {

	//d a e
	public static void main(String[] args) {
		String src = "dfjsldkfhleesadhfla sfjlsdehfjkdshfjfkldsa fseeedhflsdfhljasdfh";
		char[] arr = src.toCharArray();
		StringBuilder target = new StringBuilder();
		for (char c: arr) {
			if (c=='d' || c=='a' || c=='e') {
				target.append(c);
			}
		}
		System.out.println("target: " + target);
	}
}
