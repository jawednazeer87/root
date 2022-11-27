package org.jn.core.java.jawed.array;

public class SameMemory {

	public static void main(String[] args) {
		
		int s[] = {1,2,3};
		int t[] = s;
		System.out.println("t: "+t);
		System.out.println("s: "+s);
		t[0] = -100;
		System.out.println("s[0]: "+s[0]);
	}
}
