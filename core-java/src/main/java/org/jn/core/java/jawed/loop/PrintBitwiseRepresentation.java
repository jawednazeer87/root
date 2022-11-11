package org.jn.core.java.jawed.loop;

public class PrintBitwiseRepresentation {

	public static void main(String[] args) {
		byte b = 127;
		for(int s=7 ; s>=0 ; s--) {
			int x = b>>s & 1;
			System.out.print(x);
		}
	}

}
