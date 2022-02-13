package org.la.core.java.student.arfaz.assignment_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
 * 
	create a class name PatternPrinting
 * create these methods
			void increasingStar(int)
			void decreasingStar(int)
			void increasingStarWithSpace(int)
			void decreasingStarWithSpace(int)
			void pyramid(int)
			void reversePyramid(int)
			void diamond(int)
			void numRow(int)
			void numColumn(int).
 */

public class PatternPrinting {
	//	static Logger log = LoggerFactory.getLogger(PrintStarReverseRight.class);

	public static void main(String[] args) {
		int a=4;
		increasingStar(a);
		decreasingStar(a);
		increasingStarWithSpace(a);
		decreasingStarWithSpace(a);
		pyramid(a);
		reversePyramid(a);
		diamond(a);
		numRow(a);
		numColumn(a);
	}


	static  void increasingStar(int b)  {
		for(int i=1;i<=b;i++)      {
			for(int j=1;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
        System.out.println();//For New line after one pattern
	}
	static  void decreasingStar(int b)  {
		for(int i=1;i<=b;i++)      {
			for(int j=b;j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(); //For New line after one pattern

	}
	static  void	increasingStarWithSpace(int b) {
		for(int i=1;i<b;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println(); //For New line after one pattern

	}
	static  void	decreasingStarWithSpace(int b) {
		for(int i=1;i<=b;i++) {
			for(int j=b;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println(); //For New line after one pattern

	}
	
	static  void	pyramid(int b) {
		for(int i=1;i<=b;i++) {
			for(int j=b;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println(); //For New line after one pattern

	}
	static  void	reversePyramid(int b) {
		for(int i=1;i<=b;i++) {
			
			for(int  j=b;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
		}
		
		System.out.println(); //For New line after one pattern

	}
	static  void	diamond(int a) {
		for(int i=1;i<=a;i++) {
			for(int k=a;k>i;k--)  {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
			System.out.print("* ");

			}
			
			System.out.println();
		}
		  
		  	for(int i=1;i<=a;i++) {
		  		
		  		for(int j=a;j>=i;j--)  {
		  			
		  				System.out.print("* ");
		  			
		  		}
		  		System.out.println();  // here it is used after printing * needs to print line
		  		for(int k=1;k<=i;k++)  {
		  			System.out.print(" ");
		  		}
		  		
		  	}

		  	System.out.println(); //For New line after one pattern

	}
	static  void numRow(int a) {
		int i;
		for( i=1;i<=a;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("");
				
			}
			

		}
		System.out.println("row="+(i-1));
	}
	static  void  numColumn(int a) {
		int j=0;
		for(int i=1;i<=a;i++) {
//			System.out.print("row="+i);

			for( j=1;j<=a;j++) {
//				System.out.print("col="+j);
				
			}
			
		}
		System.out.println("\n"+"c="+(j-1));
	}

}