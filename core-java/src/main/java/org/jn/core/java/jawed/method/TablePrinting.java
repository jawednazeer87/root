package org.jn.core.java.jawed.method;

public class TablePrinting {

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
		System.out.println("\nTable of: "+n);
		while(i<=10) {
			int prod = i * n;
			System.out.println(n+" * "+i+" = "+prod);
			i++;
		}
	}
}
