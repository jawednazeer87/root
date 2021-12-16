package org.la.core.java.student.sajid.looping.assignment4;

public class Wap07 {

	public static void main(String[] args) {
		int i = 1;
		int j = 100;
		
		
		for(int a=i;a<=j;a++) {
			
			int rem = a%10;
			
			if (rem ==0) {	
				System.out.print(" "+a);
			}
		}

	}

}
