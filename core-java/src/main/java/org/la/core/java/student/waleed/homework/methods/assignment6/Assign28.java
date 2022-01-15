package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign28 {

	public static void main(String[] args) {
		  
		

		int n = 7;
		diamond(n);
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

	}


