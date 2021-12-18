package org.la.core.java.jawed.array;

public class Copy {

	public static void main(String[] args) {
		
		int s[] = {1, 2, 3, 4, 5};
		int t[] = new int[s.length];
		for(int i=0 ; i<s.length ; i++) {
			t[i] = s[i];
		}
		
		for(int i=0 ; i<t.length ; i++) {
			System.out.println("t["+i+"] = "+t[i]);
		}
		t[0] = 13222;
		System.out.println("s[0]: "+s[0]);
	}
}
