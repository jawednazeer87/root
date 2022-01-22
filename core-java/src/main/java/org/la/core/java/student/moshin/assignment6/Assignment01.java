package org.la.core.java.student.moshin.assignment6;

public class Assignment01 {

	public static void main(String[] args) {
		int b [] = {-68, -98, -23, -87, -49, 50, -54, 59, 52, 89, -17, -14, -44, 15, 19};
		printNegative( b );
		
	}
		
		 static void printNegative(int b []) {
			
			for(int i=0 ; i<=b.length-1 ; i++) {
				if(b [i] <0) {
					System.out.println("Negative number with postion ["+i+"] ="+b [i]);
		

	}

}
		}
}
