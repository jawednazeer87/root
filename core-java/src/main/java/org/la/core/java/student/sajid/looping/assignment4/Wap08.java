package org.la.core.java.student.sajid.looping.assignment4;

public class Wap08 {

	public static void main(String[] args) {
		int i = 1;
		int j = 10;
		
		
		for(int a=i;a<=j;a++) {
			
			int rem1 = a%2;
			int rem2 = a%3;
			
			if (rem1 == 0 || rem2 ==0) {	
				System.out.print(" "+a);
			}
		}


	}

}
