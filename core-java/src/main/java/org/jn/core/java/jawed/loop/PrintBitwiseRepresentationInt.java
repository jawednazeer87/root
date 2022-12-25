package org.jn.core.java.jawed.loop;

public class PrintBitwiseRepresentationInt {

	public static void main(String[] args) {
		int b = -1;
		for(int s=31 ; s>=0 ; s--) {
			int x = b>>s & 1;
			System.out.print(x);
		}
	}

}
