package org.la.core.java.student.majeed.assignment6;

public class P38PatternPrinting {
	
	public static void main(String[] args) {
		/*
		create a class name PatternPrinting
		create these methods
			void increasingStar(int)
			void decreasingStar(int)
			void increasingStarWithSpace(int)
			void decreasingStarWithSpace(int)
			void pyramid(int)
			void reversePyramid(int)
			void diamond(int)
			void numRow(int)
			void numColumn(int)
		 */
		System.out.println("Printing Increasing Star");
		increasingStar(5);
		System.out.println("Printing Decreasing Star");
		decreasingStar(5);
		System.out.println("Printing Increasing Star with Space");
		increasingStarWithSpace(5);
		System.out.println("Printing Decreasing Star with Space");
		decreasingStarWithSpace(5);	
		System.out.println("Printing Pyramid");
		pyramid(5);
		System.out.println("Printing Reverse Pyramid");
		reversePyramid(5);
		System.out.println("Printing Diamond");
		diamond(5);		
	}
	
	static void increasingStar(int a) {
		for(int i= 1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println("");
		}		
	}
	static void decreasingStar(int a) {
		for(int i= a;i>=1;i--) {
			for(int j=i;j>=1;j--) {
			System.out.print("*");
			}
			System.out.println("");
		}		
	}
	static void increasingStarWithSpace(int a) {
		for(int i= 1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("* ");
			}
			System.out.println("");
		}			
	}
	static void decreasingStarWithSpace(int a) {
		for(int i= a;i>=1;i--) {
			for(int j=i;j>=1;j--) {
			System.out.print("* ");
			}
			System.out.println("");
		}		
	}
	static void pyramid(int a) {
		int i;
		int j;
        for (i = 0; i < a; i++) {
            for (j = a - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }	
	}
	static void reversePyramid(int a) {
		int i;
		int j;
	       for (i = 0; i < a; i++) {
	            for (j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	            for (j = 0; j < a - i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }		
	}
	static void diamond(int a) {
		int i;
		int j;
        for (i = 0; i < a; i++) {
            for (j = a - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	       for (i = 0; i < a; i++) {
	            for (j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	            for (j = 0; j < a - i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }	        
	}
}