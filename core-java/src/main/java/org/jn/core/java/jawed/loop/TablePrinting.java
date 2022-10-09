package org.jn.core.java.jawed.loop;

public class TablePrinting {

	public static void main(String[] args) {

		int i = 1;
		int n = 11;
		
		while(i<=10) {
			int prod = i * n;
			System.out.println(prod);
			i++;
		}
		
		System.out.println("--------  end  -----------: "+i);
	}

}