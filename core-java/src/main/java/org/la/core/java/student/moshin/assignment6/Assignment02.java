package org.la.core.java.student.moshin.assignment6;

public class Assignment02 {

	public static void main(String[] args) {
		int b [] = {-68, -98, -23, -87, -49, 50, -54, 59, 52, 89, -17, -14, -44, 15, 19};
		printPositive ( b );
		;
		
	}
	
	
	 static void printPositive(int b []) {
		 int x =0;
		for(int i : b) {
			
			if(i >=0) {
				System.out.println("Positive number with postion ["+x+"] = "+i);
				x++;
			}

		}
	 }
}
