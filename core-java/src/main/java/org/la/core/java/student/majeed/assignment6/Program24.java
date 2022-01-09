package org.la.core.java.student.majeed.assignment6;

public class Program24 {

	public static void main(String[] args) {
		/*
		void fibonocci(int)
		print fibonacci series 
		 */
		fibonocci(11);
	}
	
	static void fibonocci(int a) {
		int i = 0, j = 0, k = 1, m = 0;
		while(i<=a) {			
			
			System.out.print(j+",");
			
			m = j + k;
			j=k;
			k=m;
			i++;
			
		}
		}
	

}