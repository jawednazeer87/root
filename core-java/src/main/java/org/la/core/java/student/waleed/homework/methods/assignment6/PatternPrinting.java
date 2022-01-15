package org.la.core.java.student.waleed.homework.methods.assignment6;

public class PatternPrinting {

	public static void main(String[] args) {
		
		
		
		 int n =7;
		 
		increasingStar(n);
		
	    decreasingStar(n);
	    
	 	 increasingStarWithSpace(n);
	 	 
	   decreasingStarWithSpace(n);
	   
		 pyramid(n);
		 
		 reversePyramid(n);
		 
		 diamond(n);
		 
		 numRow(n);
		 
		 numColumn(n);
		
	    }
		
		static void increasingStar(int n) {
			
          for(int j=1; j<=n ;j++) {
				
				for(int x=1 ; x<=j ; x++) {
					System.out.print("*");
				}
				System.out.println("");}
			
		}
		static void decreasingStar(int n) {
			for(int i=1; i<=n ;i++) {
				
			
				for(int x=1 ; x<=n-i+1 ; x++) {
					System.out.print("*");
				}
				System.out.println("");
			
		}
		}
		static void increasingStarWithSpace(int n) {
			
			for(int j=1; j<=n ;j++) {
			for(int spc=1 ; spc<=n-j ; spc++) {
				System.out.print(" ");
			}
			for(int x=1 ; x<=j ; x++) {
				System.out.print("*");
			}
			System.out.println("");}
		}
		static void decreasingStarWithSpace(int n ) {
			
			for(int i=1; i<=n ;i++) {
				
				for(int spc=1 ; spc<i ; spc++) {
					System.out.print(" ");
				}
				for(int x=1 ; x<=n-i+1 ; x++) {
					System.out.print("*");
				}
				System.out.println("");}
		}
		static void pyramid(int n) {
			for(int j=1; j<=n ;j++) {
				for(int spc=1 ; spc<=n-j ; spc++) {
					System.out.print(" ");
				}
				for(int x=1 ; x<=j ; x++) {
					System.out.print("*"+" ");
				}
				System.out.println("");}
			
			
		}
		static void reversePyramid(int n) {
			
			
			for(int i=1; i<=n ;i++) {
				
				for(int spc=1 ; spc<i ; spc++) {
					System.out.print(" ");
				}
				for(int x=1 ; x<=n-i+1 ; x++) {
					System.out.print("*"+ " ");
				}
				System.out.println("");}
		}
			
		
		static void diamond(int n) {
			
			
			for(int i=-n ; i<=n ; i++) {
				
				int j=i;
				if(j<0){
					j = -j;
				}
				
				//printing space
				for(int k=1 ; k<=j ; k++) {
					System.out.print(" ");
				}
				//printing star
				for(int k=0 ; k<=n-j ; k++) {
					System.out.print("* ");
				}
				System.out.println("");
			}
			
		}
		static void numRow(int  n) {
			
			
				for(int a=1; a<=n ;a++) {
					
					for(int spc=1 ; spc<=n-a ; spc++) {
						System.out.print(" ");
					}
					for(int x=1 ; x<=a ; x++) {
						System.out.print(a+" ");
					}
					System.out.println("");
				}
			
		}
		static void numColumn(int n) {
			
			for(int a=1; a<=n ;a++) {
				for(int x=1 ; x<=a ; x++) {
					System.out.print(x+" ");
				}
				System.out.println("");
			
			
		}

	}
}

