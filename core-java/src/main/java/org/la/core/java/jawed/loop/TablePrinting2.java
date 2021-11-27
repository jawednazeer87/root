package org.la.core.java.jawed.loop;

public class TablePrinting2 {

	public static void main(String[] args) {

		int i = 1;
		int n = 2;
		
		while(i<=10) {
			int prod = i * n;
			System.out.println(n+" * "+i+" = "+prod);
			i++;
		}
		
		
		System.out.println("--------  end  -----------");
	}

}