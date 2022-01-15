package org.la.core.java.jawed.method;

public class MethodTwo2 {

	public static void main(String[] args) {
		
		int i = 5;
		table(i);
		
		int j = 7;
		table(j);
		
		int k = 2;
		table(k);
	}
	
	static void table(int n) {
		int i = 1;
		while(i<=10) {
			int prod = i * n;
			System.out.println(n+" * "+i+" = "+prod);
			i++;
		}
	}
}
